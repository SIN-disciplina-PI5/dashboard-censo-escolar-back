package com.unicap.pi.school.census.resource;

import com.unicap.pi.school.census.domain.dto.DSchoolCensus;
import com.unicap.pi.school.census.domain.dto.DSchoolCensusResponse;
import com.unicap.pi.school.census.service.SchoolCensusService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/school-census")
@RequiredArgsConstructor
public class SchoolCensusResource {

    private SchoolCensusService schoolCensusService;

    @PostMapping("/predict")
    public ResponseEntity<DSchoolCensusResponse> predict(@RequestBody DSchoolCensus input) {
        return ResponseEntity.ok(schoolCensusService.predict(input));
    }
}
