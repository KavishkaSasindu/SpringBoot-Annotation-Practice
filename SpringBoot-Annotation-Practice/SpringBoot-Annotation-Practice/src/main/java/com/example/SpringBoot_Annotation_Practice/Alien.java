package com.example.SpringBoot_Annotation_Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {


    public Alien() {
        System.out.println("Alien Object create");
    }

    public void code() {
        System.out.println("Coding...");
    }

}
