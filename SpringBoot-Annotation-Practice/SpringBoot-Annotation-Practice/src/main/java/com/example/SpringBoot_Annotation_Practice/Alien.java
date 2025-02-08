package com.example.SpringBoot_Annotation_Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    private Computer computer;

    public Alien() {
        System.out.println("Alien Object create");
    }

    public void code() {
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
