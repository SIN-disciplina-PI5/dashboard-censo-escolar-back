package com.unicap.pi.schoolcensus.repository;

import com.unicap.pi.schoolcensus.entity.CSVParams;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CSVRepository extends JpaRepository<CSVParams,Long> {
}
