package com.example.SpringBoot_Annotation_Practice.service;

import com.example.SpringBoot_Annotation_Practice.model.Laptop;
import com.example.SpringBoot_Annotation_Practice.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    private Laptop laptop;
    @Autowired
    LaptopRepository laptopRepository;

    public LaptopService() {
        System.out.println("LaptopService");
    }

    public void addLaptop(Laptop laptop) {
        this.laptop = laptop;
        laptopRepository.save(laptop);
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
