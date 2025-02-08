package com.example.SpringBoot_Annotation_Practice;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    public Laptop() {
        System.out.println("Laptop");
    }

    public void compile() {
        System.out.println("Compiling....");
    }
}
