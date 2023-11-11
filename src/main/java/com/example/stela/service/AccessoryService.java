package com.example.stela.service;


import com.example.stela.dto.AccessoryDto;
import com.example.stela.form.AccessoryCreateForm;
import com.example.stela.form.AccessoryUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccessoryService {
    AccessoryDto create(AccessoryCreateForm form);
    Page<AccessoryDto> findAll(Pageable pageable);
    AccessoryDto update(Long id, AccessoryUpdateForm form);
    void  deleteById(Long id);
}
