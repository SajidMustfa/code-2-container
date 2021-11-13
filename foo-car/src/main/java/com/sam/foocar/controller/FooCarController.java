package com.sam.foocar.controller;


import com.sam.foocar.model.Car;
import com.sam.foocar.service.CarService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/car")
@RestController
public class FooCarController {

    private CarService carService;

    public FooCarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping("/{carId}")
    public ResponseEntity<Car> getCarInfo(@PathVariable("carId") String carId){
        return new ResponseEntity<>(carService.getCarByID(carId), HttpStatus.OK);
    }

}
