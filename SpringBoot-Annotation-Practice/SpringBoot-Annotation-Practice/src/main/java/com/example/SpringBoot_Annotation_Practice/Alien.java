package com.example.SpringBoot_Annotation_Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    private Laptop laptop;

    public Alien() {
        System.out.println("Alien Object create");
    }

    public void code() {
        laptop.compile();
        System.out.println("Coding...");
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
