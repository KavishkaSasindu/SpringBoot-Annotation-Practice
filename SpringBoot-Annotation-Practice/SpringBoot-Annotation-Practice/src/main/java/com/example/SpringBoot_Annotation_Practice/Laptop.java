package com.example.SpringBoot_Annotation_Practice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer{

    public Laptop() {
        System.out.println("Laptop");
    }

    public void compile() {
        System.out.println("Compiling....");
    }
    @Override
    public void compute() {
        System.out.println("Computing.... Laptop");
    }
}
