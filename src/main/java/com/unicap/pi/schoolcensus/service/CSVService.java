package com.unicap.pi.schoolcensus.service;

import com.unicap.pi.schoolcensus.entity.CSVParams;
import com.unicap.pi.schoolcensus.repository.CSVRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class CSVService {
    private final CSVRepository repository;

    public List<CSVParams> processCsv(MultipartFile multipartFile) throws IOException {
        List<CSVParams> csvParamsList = new ArrayList<>();
        InputStream file = multipartFile.getInputStream();
        try(CSVParser csvParser = new CSVParser(new InputStreamReader(file), format())){
            for (CSVRecord record : csvParser) {
                CSVParams csv = new CSVParams(record);
                csvParamsList.add(csv);
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        this.repository.saveAll(csvParamsList);
        return csvParamsList;
    }

    private CSVFormat format() {
        return CSVFormat.Builder.create().setDelimiter(';').setHeader().build();
    }

}
