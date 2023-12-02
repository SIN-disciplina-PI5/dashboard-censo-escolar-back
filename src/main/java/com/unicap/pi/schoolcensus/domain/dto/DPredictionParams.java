package com.unicap.pi.schoolcensus.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DPredictionParams {

    @NotNull
    @JsonProperty("region-code")
    Long regionCode;

    @NotNull
    @JsonProperty("uf-code")
    Long ufCode;

    @NotNull
    @JsonProperty("county-code")
    Long countyCode;

    @NotNull
    @JsonProperty("meso-region-code")
    Long mesoRegionCode;

    @NotNull
    @JsonProperty("micro-region-code")
    Long microRegionCode;

    @NotNull
    @JsonProperty("district-code")
    Long districtCode;

    @NotNull
    @JsonProperty("dependency-type")
    Long dependencyType;

    @NotNull
    @JsonProperty("location-type")
    Long locationType;

    @NotNull
    @JsonProperty("differentiated-location-type")
    Long diffLocationType;

    @NotNull
    @JsonProperty("education-department-link")
    Long educationDepartmentLink;

    @NotNull
    @JsonProperty("public-security-link")
    Long publicSecurityLink;

    @NotNull
    @JsonProperty("health-department-link")
    Long healthDepartmentLink;

    @NotNull
    @JsonProperty("other-department-link")
    Long otherDepartmentLink;
}
