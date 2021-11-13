package com.sam.foocar.service;

import java.util.Arrays;


import com.sam.foocar.model.Car;

import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    private  Car carOne,carTwo;

    public CarServiceImpl(){
        carOne = Car.builder().
        carId("SUV-1A").
        carName("Ford Ecosport").
        carPrice(1000000.00).
        carMake("Compact SUV").
        build();

        carTwo = Car.builder().
        carId("SUV-2B").
        carName("Renault Duster").
        carPrice(1300000.00).
        carMake("Compact SUV").
        build();
    }


    @Override
    public Car getCarByID(String carId) {     
        return Arrays.asList(carOne,carTwo).stream().filter(car -> car.getCarId().equals(carId)).findFirst().get();
    }
    
}
