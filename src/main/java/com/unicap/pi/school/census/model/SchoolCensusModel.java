package com.unicap.pi.school.census.model;

import com.unicap.pi.school.census.domain.dto.DSchoolCensus;
import com.unicap.pi.school.census.domain.dto.DSchoolCensusResponse;
import org.tensorflow.SavedModelBundle;
import org.tensorflow.Session;
import org.tensorflow.Tensor;

public class SchoolCensusModel {

    private final SavedModelBundle model;

    public SchoolCensusModel(String modelpath) {
        this.model = SavedModelBundle.load(modelpath, "serve");
    }

    public DSchoolCensusResponse predict(DSchoolCensus input) {
        Long[][] treatedInput = {{ input.getRegionCode(), input.getUfCode(), input.getCountyCode(), input.getMesoRegionCode(),
                                    input.getMicroRegionCode(), input.getDistrictCode(), input.getEntityCode(), input.getDependencyType(),
                                    input.getLocationType(), input.getDiffLocationType(), input.getEducationDepartmentLink(),
                                    input.getPublicSecurityLink(), input.getHealthDepartmentLink(), input.getOtherDepartmentLink() }};

        Tensor<Long> inputTensor = Tensor.create(treatedInput, Long.class);

        Session.Runner runner = model.session().runner().feed("input", inputTensor);

        Tensor<Long> outputTensor = (Tensor<Long>) runner.fetch("output").run().get(0);

        Long[] outputArray = new Long[outputTensor.numElements()];
        outputTensor.copyTo(outputArray);

        return new DSchoolCensusResponse(outputArray[0]);
    }
}
