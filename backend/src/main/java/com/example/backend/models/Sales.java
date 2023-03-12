package com.example.backend.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="sales")
public class Sales extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "id")
    private int saleId;

    @NotBlank(message="number of bedrooms must not be blank")
    private int beds;

    @NotBlank(message="number of bathrooms must not be blank")
    private int baths;

    @NotBlank(message="size of house must not be blank")
    private int size;

    @NotBlank(message = "zip code of house must not be blank")
    @Column(length = 5)
    private String zipCode;

    @NotBlank(message = "sale price must not be blank")
    private int price;
}
