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

    @NotNull(message="number of bedrooms must not be blank")
    public int beds;

    @NotNull(message="number of bathrooms must not be blank")
    public int baths;

    @NotNull(message="size of house must not be blank")
    public int size;

    @NotBlank(message = "zip code of house must not be blank")
    @Column(length = 5, name="zipcode")
    public String zipCode;

    @NotNull(message = "sale price must not be blank")
    public int price;
}
