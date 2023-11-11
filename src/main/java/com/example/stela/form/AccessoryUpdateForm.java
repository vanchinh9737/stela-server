package com.example.stela.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Setter
@Getter
public class AccessoryUpdateForm {

    //    @NotNull:not null
//@NotEmpty not null & length >0
//    @NotBlank  not null & length >0  va ko dc chua toan bo dau cach
    @NotBlank
    @Length(max = 255)
    private String name;

    @NotNull
    @PositiveOrZero  // nhap vo so >0
    private Long price;

    @NotBlank
    @Length(max = 255)
    private String statusDamaged;

    @NotBlank
    @Length(max = 255)
    private String repairStatus;


}
