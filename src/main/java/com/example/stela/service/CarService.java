package com.example.stela.service;


import com.example.stela.dto.CarDto;
import com.example.stela.entity.Car;
import com.example.stela.form.CarCreateForm;
import com.example.stela.form.CarUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarService {
    CarDto create(CarCreateForm form);

    Page<CarDto> findAll(Pageable page);

    CarDto update(CarUpdateForm form);

    void deleteById(Car.PrimaryKey pk);




}
