package com.unicap.pi.schoolcensus.resource;

import com.unicap.pi.schoolcensus.domain.dto.DModelResponse;
import com.unicap.pi.schoolcensus.domain.dto.DPredictionParams;
import com.unicap.pi.schoolcensus.service.PredictionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/predict")
@RequiredArgsConstructor
@CrossOrigin
public class PredictionResource {

    private final PredictionService predictionService;

    @PostMapping
    public ResponseEntity<DModelResponse> predict(@RequestBody @Valid DPredictionParams params) {
        return ResponseEntity.ok(predictionService.predict(params));
    }
}
