package com.example.SpringBoot_Annotation_Practice.repository;

import com.example.SpringBoot_Annotation_Practice.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop laptop) {
        System.out.println("Laptop saved");
    }
}
