package com.homework22.executor;


import com.homework22.models.Laptop;
import com.homework22.services.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Executor {

    private  LaptopService service;

    public Executor(){

    }

    @Autowired
    public Executor(LaptopService service) {
        this.service = service;
    }

    public void execute() {
        fillDbWithData();

        System.out.println("\nAll computers in database:");
        service.getAllLaptop().forEach(System.out::println);

        System.out.println("\nSelect memory greater than 16GB:");
        service.getByMemoryAfter(16).forEach(System.out::println);

        System.out.println("\nSelect used computers:");
        service.getByUsage(true).forEach(System.out::println);

        System.out.println("\nSelect all by manufacturer DESC");
        service.getAllByManufacturerDESC().forEach(System.out::println);
    }


    private void fillDbWithData() {
        service.saveLaptop(new Laptop("XPS 17", "DELL", "Core i7-1065G7", 64, false, "plastic", new BigDecimal("1500.00"), "1.06.2020"));
        service.saveLaptop(new Laptop("ZenBook Pro Duo", "Asus", "Core i7 1065G7", 32, false, "plastic", new BigDecimal("1300.00"), "1.06.2020"));
        service.saveLaptop(new Laptop("MacBook Pro", "Apple", "Core i7-9750H", 16, false, "metal", new BigDecimal("2200.00"), "1.06.2020"));
        service.saveLaptop(new Laptop("Zephyrus G14", "ASUS", "AMD Ryzen 7 4800HS", 8, false, "plastic", new BigDecimal("1100.00"), "1.06.2020"));
        service.saveLaptop(new Laptop("XPS 13", "DELL", "Intel Core i5-1035G1", 16, false, "plastic", new BigDecimal("1400.00"), "1.06.2020"));
        service.saveLaptop(new Laptop("MacBook Pro 15", "Apple", "Intel Core i7-9750H", 16, false, "plastic", new BigDecimal("2200.00"), "1.06.2020"));
        service.saveLaptop(new Laptop("TUF Gaming", "ASUS", "AMD Ryzen 5 3550H", 8, true, "plastic", new BigDecimal("1000.00"), "1.06.2020"));
        service.saveLaptop(new Laptop("Mi Notebook Pro", "Xiaomi", "Intel Core i5-8250U", 16, false, "plastic", new BigDecimal("900.00"), "1.06.2020"));
        service.saveLaptop(new Laptop("MACBOOK AIR", "APPLE", "Cor i5-10300H", 16, false, "metal", new BigDecimal("1000.00"), "11.03.2019"));
        service.saveLaptop(new Laptop("Gram 17", "LG", "Core i7 i7-10750H", 32, false, "plastic", new BigDecimal("2000.00"), "1.06.2020"));
        service.saveLaptop(new Laptop("ThinkPad X1 Extreme", "Lenovo", "Core i9-10885H", 64, true, "plastic", new BigDecimal("1200.00"), "1.06.2020"));
        service.saveLaptop(new Laptop("ConceptD 7", "Acer", "Core i7-1065G7", 16, false, "plastic", new BigDecimal("1300.00"), "1.06.2020"));
        service.saveLaptop(new Laptop("Creator 15", "MSI", "Core i7-10875H", 32, true, "plastic", new BigDecimal("1300.00"), "1.06.2020"));
        service.saveLaptop(new Laptop("MateBook D 14", "Huawei", "Intel Core i5-8250U", 16, false, "plastic", new BigDecimal("900.00"), "1.06.2020"));
        service.saveLaptop(new Laptop("ROG Strix G17", "ASUS", "AMD Ryzen 5 3500U", 8, false, "plastic", new BigDecimal("700.00"), "1.06.2020"));
        service.saveLaptop(new Laptop("RedmiBook 16 Ryzen", "Xiaomi", "AMD Ryzen 7 4700U", 16, false, "plastic", new BigDecimal("900.00"), "1.06.2020"));
        service.saveLaptop(new Laptop("G3 15", "DELL", "Intel Core i5-9300H", 8, false, "plastic", new BigDecimal("980.00"), "1.06.2020"));
        service.saveLaptop(new Laptop("VivoBook S15", "ASUS", "AMD Ryzen 7 4700U", 8, true, "plastic", new BigDecimal("980.00"), "1.06.2020"));
        service.saveLaptop(new Laptop("Omen 15", "HP", "AMD Ryzen 7 4800H", 8, false, "plastic", new BigDecimal("980.00"), "1.06.2020"));
        service.saveLaptop(new Laptop("Legion 5", "Lenovo", "Intel Core i7-10750H", 16, false, "plastic", new BigDecimal("1400.00"), "1.06.2020"));

    }
}
