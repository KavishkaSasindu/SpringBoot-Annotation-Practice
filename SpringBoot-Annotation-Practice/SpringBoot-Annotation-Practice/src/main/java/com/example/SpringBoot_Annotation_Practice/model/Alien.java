package com.example.SpringBoot_Annotation_Practice.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    Laptop laptop;

    @Autowired
    private Computer computer;

//    non para constructor
    public Alien() {
        System.out.println("Alien Object is created");
    }

    public void code() {
        laptop.compile();
        computer.compute();
        System.out.println("Coding...");
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
