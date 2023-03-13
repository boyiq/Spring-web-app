package com.example.backend.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "id")
    public int saleId;

    @NotBlank(message="number of bedrooms must not be blank")
    public int beds;

    @NotBlank(message="number of bathrooms must not be blank")
    public int baths;

    @NotBlank(message="size of house must not be blank")
    public int size;

    @NotBlank(message = "zip code of house must not be blank")
    @Column(length = 5, name="zipcode")
    public String zipCode;

    @NotBlank(message = "sale price must not be blank")
    public int price;
}
