package com.unicap.pi.schoolcensus.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DSchoolCensusParams {
    @JsonProperty("region-code")
    Long regionCode;

    @JsonProperty("uf-code")
    Long ufCode;

    @JsonProperty("county-code")
    Long countyCode;

    @JsonProperty("meso-region-code")
    Long mesoRegionCode;

    @JsonProperty("micro-region-code")
    Long microRegionCode;

    @JsonProperty("district-code")
    Long districtCode;

    @JsonProperty("dependency-type")
    Long dependencyType;

    @JsonProperty("location-type")
    Long locationType;

    @JsonProperty("differentiated-location-type")
    Long diffLocationType;

    @JsonProperty("education-department-link")
    Long educationDepartmentLink;

    @JsonProperty("public-security-link")
    Long publicSecurityLink;

    @JsonProperty("health-department-link")
    Long healthDepartmentLink;

    @JsonProperty("other-department-link")
    Long otherDepartmentLink;
}
