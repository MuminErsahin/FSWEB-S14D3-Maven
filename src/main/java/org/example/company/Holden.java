package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
       return "Holden engine is starting";
    }

    @Override
    public String accelerate() {
        return "Holden accelerating";
    }

    @Override
    public String startEngine() {
        return "Holden is braking";
    }

}
