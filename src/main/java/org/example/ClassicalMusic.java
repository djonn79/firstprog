package org.example;


import org.springframework.stereotype.Component;


public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Rhapsody";
    }

    public void initial(){
        System.out.println("Make init");
    }

    public void destroy(){
        System.out.println("Destroy bean");
    }
}
