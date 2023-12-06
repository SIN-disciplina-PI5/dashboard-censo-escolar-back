package com.unicap.pi.schoolcensus.service;

import lombok.RequiredArgsConstructor;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Service
@RequiredArgsConstructor
public class CSVService {
    public Object processCsv(MultipartFile multipartFile) throws IOException {
        InputStream file = multipartFile.getInputStream();
        try(CSVParser csvParser = new CSVParser(new InputStreamReader(file), CSVFormat.DEFAULT)){
            for (CSVRecord record : csvParser) {
                System.out.println(record.get(0));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
