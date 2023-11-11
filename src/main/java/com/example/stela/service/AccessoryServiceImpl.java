package com.example.stela.service;


import com.example.stela.dto.AccessoryDto;
import com.example.stela.entity.Accessory;
import com.example.stela.entity.Car;
import com.example.stela.form.AccessoryCreateForm;
import com.example.stela.form.AccessoryUpdateForm;
import com.example.stela.repository.AccessoryRepository;
import com.example.stela.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor  // add constructor
public class AccessoryServiceImpl implements AccessoryService {
    private final AccessoryRepository accessoryRepository;
    private final CarRepository carRepository;
    private final ModelMapper modelMapper;


    @Override
    public AccessoryDto create(AccessoryCreateForm form) {
        var accessory = modelMapper.map(form, Accessory.class);
        var pk = modelMapper.map(form, Car.PrimaryKey.class);
        var car = carRepository.findById(pk).orElse(null);
        accessory.setCar(car);

        var savedAccessory = accessoryRepository.save(accessory);
        return modelMapper.map(savedAccessory, AccessoryDto.class);

    }

    @Override
    public Page<AccessoryDto> findAll(Pageable pageable) {
        return accessoryRepository.findAll(pageable)
                .map(accessory ->
                        modelMapper.map(accessory, AccessoryDto.class));
    }

    @Override
    public AccessoryDto update(Long id, AccessoryUpdateForm form) {
        var accessory = accessoryRepository.findById(id).orElse(null);
        modelMapper.map(form, accessory);

        var savedAccessory = accessoryRepository.save(accessory);
        return modelMapper.map(savedAccessory, AccessoryDto.class);
    }

    @Override
    public void deleteById(Long id) {
        accessoryRepository.deleteById(id);
    }
}
