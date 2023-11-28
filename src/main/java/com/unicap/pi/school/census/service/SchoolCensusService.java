package com.unicap.pi.school.census.service;

import com.unicap.pi.school.census.domain.dto.DSchoolCensus;
import com.unicap.pi.school.census.domain.dto.DSchoolCensusResponse;
import com.unicap.pi.school.census.model.SchoolCensusModel;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class SchoolCensusService {

    private SchoolCensusModel model;

    private static final String PATH = "../../../resources/model/model.plk";

    @PostConstruct
    private void initializeModel() {
        model = new SchoolCensusModel(PATH);
    }

    public DSchoolCensusResponse predict(DSchoolCensus input) {
        return model.predict(input);
    }
}
