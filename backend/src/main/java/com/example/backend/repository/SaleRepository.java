package com.example.backend.repository;

import com.example.backend.models.Sale;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends CrudRepository <Sale, Integer>{
    @Query("SELECT hs FROM Sale hs WHERE (:targetZipCode is null or hs.zipCode = :targetZipCode) AND hs.price BETWEEN :minPrice AND :maxPrice AND hs.beds BETWEEN :minBeds and :maxBeds AND hs.baths BETWEEN :minBaths and :maxBaths AND hs.size BETWEEN :minSize and :maxSize")
    List<Sale> findAllByCriteria(
            @Param("targetZipCode") String targetZipCode,
            @Param("minPrice") Integer minPrice,
            @Param("maxPrice") Integer maxPrice,
            @Param("minBeds") Integer minBeds,
            @Param("maxBeds") Integer maxBeds,
            @Param("minBaths") Integer minBaths,
            @Param("maxBaths") Integer maxBaths,
            @Param("minSize") Integer minSize,
            @Param("maxSize") Integer maxSize);

}
