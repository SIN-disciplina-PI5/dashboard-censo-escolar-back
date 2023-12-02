package com.unicap.pi.schoolcensus.resource;

import com.unicap.pi.schoolcensus.domain.dto.DModelResponse;
import com.unicap.pi.schoolcensus.domain.dto.DPredictionParams;
import com.unicap.pi.schoolcensus.service.PredictionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/predict")
@RequiredArgsConstructor
public class PredictionResource {

    private final PredictionService predictionService;

    @PostMapping
    public ResponseEntity<DModelResponse> predict(@RequestBody @Valid DPredictionParams params) {
        return ResponseEntity.ok(predictionService.predict(params));
    }
}
