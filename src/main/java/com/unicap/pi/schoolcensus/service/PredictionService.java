package com.unicap.pi.schoolcensus.service;

import com.unicap.pi.schoolcensus.client.MLModelClient;
import com.unicap.pi.schoolcensus.domain.dto.DModelResponse;
import com.unicap.pi.schoolcensus.domain.dto.DPredictionParams;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PredictionService {

    private final MLModelClient modelClient;

    public DModelResponse predict(DPredictionParams params) {
        return modelClient.predict(params);
    }
}
