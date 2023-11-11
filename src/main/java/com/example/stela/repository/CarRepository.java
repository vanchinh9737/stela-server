package com.example.stela.repository;


import com.example.stela.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository  extends JpaRepository<Car,Car.PrimaryKey> {



}
