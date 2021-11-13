package com.sam.foocar.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Car {

    private String carId;
    private String carName;
    private double carPrice;
    private String carMake;
}
