package com.unicap.pi.schoolcensus.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CSVParams {
    @Id
    private long id;
    private String cod;
}
