package com.example.stela.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Setter
@Getter
public class CarCreateForm {
    @NotBlank(message = "{car.licensePlate.NotBlank.message}")
    @Length(max = 100,message = "{car.licensePlate.Length.message}")
    private String LicensePlate;

    @NotNull
    @PastOrPresent // qua khu va hien tai
    private LocalDate repairDate;

    @NotBlank
    @Length(max = 100)
    private String customerName;

    @NotBlank
    @Length(max = 100)
    private String catalog;

    @NotBlank
    @Length(max = 100)
    private String carMaker;


}
