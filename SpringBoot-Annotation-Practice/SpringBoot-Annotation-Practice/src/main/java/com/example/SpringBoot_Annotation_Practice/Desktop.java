package com.example.SpringBoot_Annotation_Practice;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

    @Override
    public void compute(){
        System.out.println("Computing Desktop");
    }

}
