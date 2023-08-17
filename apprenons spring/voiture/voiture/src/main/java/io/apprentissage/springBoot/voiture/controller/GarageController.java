package io.apprentissage.springBoot.voiture.controller;

import io.apprentissage.springBoot.voiture.model.Car;
import io.apprentissage.springBoot.voiture.service.ServiceGarage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class GarageController {
    @Autowired
    private ServiceGarage serviceGarage;
    @GetMapping("/cars")
    public List<Car> getCar(){
        return serviceGarage.getCars();
    }
    @GetMapping("/caruniq/{id}")
    public Car getCar(@PathVariable long id){
        return serviceGarage.getCar(id);
    }
    @PostMapping("/createCar")
    public void addCar(@RequestBody Car car){
        serviceGarage.addCar(car);
    }
    @PutMapping("/updateCar/{id}")
    public void updateCar(@PathVariable long id,@RequestBody Car car){
       serviceGarage.updateCar(id, car);
    }
    @DeleteMapping("/deleteCar/{id}")
    public void delete(@PathVariable long id){
         serviceGarage.deleteCar(id);
    }

}
