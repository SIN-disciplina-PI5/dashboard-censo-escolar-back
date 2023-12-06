package com.unicap.pi.schoolcensus.resource;

import com.unicap.pi.schoolcensus.service.CSVService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping("/csv")
@RequiredArgsConstructor
public class CSVResource {
    private final CSVService csvResourceService;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {

        this.csvResourceService.processCsv(file);
        return "Sucess";
    }
}
