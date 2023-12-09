package com.unicap.pi.schoolcensus.configuration;

import jakarta.servlet.MultipartConfigElement;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

@Configuration
public class FileUploadConfig {

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        // Defina o limite máximo de tamanho para o upload de arquivos (por exemplo, 10MB)

        factory.setMaxFileSize(DataSize.ofMegabytes(200l));
        factory.setMaxRequestSize(DataSize.ofMegabytes(200l));
        return factory.createMultipartConfig();
    }
}
