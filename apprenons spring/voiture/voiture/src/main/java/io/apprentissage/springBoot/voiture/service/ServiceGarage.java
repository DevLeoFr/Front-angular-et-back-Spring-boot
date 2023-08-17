package io.apprentissage.springBoot.voiture.service;

import io.apprentissage.springBoot.voiture.model.Car;
import io.apprentissage.springBoot.voiture.repository.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceGarage {
    @Autowired
    private GarageRepository garageRepository;
//    static private ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
//            new Car( 1,"Laguna","Renault",2004, Car.Color.Blue),
//            new Car(2,"5008","peugeot",2013, Car.Color.Green),
//            new Car(3,"C4","",2006, Car.Color.Red),
//            new Car(4,"206","",2004, Car.Color.Yellow),
//            new Car( 5,"Laguna","Renault",2010, Car.Color.Red)
//
//    ));
    public List<Car> getCars(){
        List <Car> cars = new ArrayList<>();
        garageRepository.findAll().forEach(car->{
            cars.add(car);
        });
        return cars;
    }

    public Car getCar(long id) {
        return garageRepository.findById(id).orElse(null);
    }
    public void deleteCar(long id){
        garageRepository.deleteById(id);
    }
    public void addCar(Car car){
        garageRepository.save(car);
    }
    public void updateCar( long id,Car car){
        garageRepository.save(car);
    }
}
