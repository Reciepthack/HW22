package com.homework22.services;


import com.homework22.models.Laptop;
import com.homework22.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LaptopService {
    private  LaptopRepository repository;

    public LaptopService() {
    }

    @Autowired
    public LaptopService(LaptopRepository sortedRepository) {
        this.repository = sortedRepository;
    }

    public void saveLaptop(Laptop laptop){
        repository.save(laptop);
    }

    public List<Laptop> getAllLaptop(){
        return (List<Laptop>) repository.findAll();
    }

    public List<Laptop> getAllByManufacturerDESC(){
        List<Laptop> list = new ArrayList<>();
        repository.findAll(Sort.by("manufacturer").descending()).forEach(list::add);
        return list;
    }

    public List<Laptop> getByMemoryAfter(int memory){
        return repository.findAllByMemoryAfter(memory);
    }

    public List<Laptop> getByUsage(boolean usage){
        return repository.findAllByUsed(usage);
    }
}
