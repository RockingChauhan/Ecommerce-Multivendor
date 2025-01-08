package com.features.repository;

import com.features.model.SellerReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerReportRepository extends JpaRepository<SellerReport,Long> {
    SellerReport findBySellerId(Long sellerId);
}
