package com.homework22.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;


@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String model;
    private String manufacturer;
    private String processor;
    private int memory;
    private boolean used;
    private String shell;
    private BigDecimal price;
    private String creationDate;

    public Laptop(String model, String manufacturer, String processor, int memory, boolean used, String shell, BigDecimal price, String creationDate) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.memory = memory;
        this.used = used;
        this.shell = shell;
        this.price = price;
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", memory=" + memory +
                ", used - " + used +
                '}';
    }
}
