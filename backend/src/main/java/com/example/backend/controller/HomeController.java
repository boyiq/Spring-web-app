package com.example.backend.controller;

import com.example.backend.models.House;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    private List<House> houses = new ArrayList<>();

    @GetMapping("/city")
    public List<String> getCity() {
        List<String> cityList = new ArrayList<>();
        for (int i = 0; i < houses.size(); i ++) {
            cityList.add(houses.get(i).getCity());
        }
    }

    @PostMapping("/add")
    public ResponseEntity<Void> create(@RequestBody House newHouse) {
        houses.add(newHouse);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }



}
