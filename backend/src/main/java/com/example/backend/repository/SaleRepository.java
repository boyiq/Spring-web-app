package com.example.backend.repository;

import com.example.backend.models.Sales;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends CrudRepository <Sales, Integer>{

}
