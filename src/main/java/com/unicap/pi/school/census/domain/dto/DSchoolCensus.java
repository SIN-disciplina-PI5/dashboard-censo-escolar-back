package com.unicap.pi.school.census.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DSchoolCensus {
    @JsonProperty("id")
    Long entityCode;

    @JsonProperty("region")
    Long regionCode;

    @JsonProperty("uf")
    Long ufCode;

    @JsonProperty("county")
    Long countyCode;

    @JsonProperty("meso-region")
    Long mesoRegionCode;

    @JsonProperty("micro-region")
    Long microRegionCode;

    @JsonProperty("district")
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
