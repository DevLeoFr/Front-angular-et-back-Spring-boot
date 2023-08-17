package io.apprentissage.springBoot.voiture.repository;
import io.apprentissage.springBoot.voiture.model.Car;

import org.springframework.data.repository.CrudRepository;
public interface GarageRepository extends CrudRepository<Car,Long>{
}
