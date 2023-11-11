package com.example.stela.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "car")
public class Car {

    @EmbeddedId // khoa chinh co 2 cot
    private PrimaryKey pk;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "catalog", nullable = false)
    private String catalog;

    @Column(name = "car_maker", nullable = false)
    private String carMaker;

    @OneToMany(mappedBy = "car")
    private List<Accessory> accessories;


    @Setter
    @Getter
    @EqualsAndHashCode
    @Embeddable
    public static class PrimaryKey {
        @Column(name = "license_plate")
        private String licensePlate;

        @Column(name = "repair_date")
        private LocalDate repairDate;
    }
}
