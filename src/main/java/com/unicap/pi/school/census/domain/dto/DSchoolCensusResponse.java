package com.unicap.pi.school.census.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DSchoolCensusResponse {

    @JsonProperty("school-operational-situation")
    Long schoolOperationalSituation;
}
