package com.example.backend.controller;

import com.example.backend.models.Sale;
import com.example.backend.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private SaleRepository saleRepository;

    @GetMapping("/allsales")
    public Iterable<Sale> getAllSales () {
        Iterable<Sale> salesList = saleRepository.findAll();
        return salesList;
    }

    @GetMapping("/sales")
    public ResponseEntity<List<Sale>> getSalesByCriteria (
            @RequestParam(name = "zipCode", required = false) String zipCode,
            @RequestParam(name = "minPrice", required = false) Integer minPrice,
            @RequestParam(name = "maxPrice", required = false) Integer maxPrice,
            @RequestParam(name = "minBeds", required = false) Integer minBeds,
            @RequestParam(name = "maxBeds", required = false) Integer maxBeds,
            @RequestParam(name = "minBaths", required = false) Integer minBaths,
            @RequestParam(name = "maxBaths", required = false) Integer maxBaths,
            @RequestParam(name = "minSize", required = false) Integer minSize,
            @RequestParam(name = "maxSize", required = false) Integer maxSize
    ) {
        List<Sale> salesList = saleRepository.findAllByCriteria(
                zipCode, minPrice, maxPrice, minBeds, maxBeds, minBaths, maxBaths, minSize, maxSize);
        return new ResponseEntity<>(salesList, HttpStatus.OK);
    }

    @PostMapping("/addsale")
    public ResponseEntity<String> addSale(@RequestBody Sale sale) {
        try {
            saleRepository.save(sale);
            return new ResponseEntity<>("House sale record added", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to add house sale" + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
