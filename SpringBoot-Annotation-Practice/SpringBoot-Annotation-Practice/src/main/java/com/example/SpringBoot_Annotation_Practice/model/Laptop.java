package com.example.SpringBoot_Annotation_Practice.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
//    constructor non-para
    public Laptop() {
        System.out.println("Laptop object is created");
    }

    @Override
    public void compute() {
        System.out.println("Laptop compute");
    }

    public void compile() {
        System.out.println("Compiling....");
    }
}
