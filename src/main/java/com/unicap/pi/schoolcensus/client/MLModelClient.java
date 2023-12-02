package com.unicap.pi.schoolcensus.client;

import com.unicap.pi.schoolcensus.domain.dto.DModelResponse;
import com.unicap.pi.schoolcensus.domain.dto.DPredictionParams;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "${client.name}", url = "${client.url}")
public interface MLModelClient {

    @PostMapping("/predict")
    DModelResponse predict(@RequestBody @Valid DPredictionParams params);
}
