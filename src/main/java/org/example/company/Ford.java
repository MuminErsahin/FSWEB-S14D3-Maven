package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
       return "Ford engine is starting";
    }

    @Override
    public String accelerate() {
       return "Ford accelerating";
    }

    @Override
    public String startEngine() {
        return "Ford is braking";
    }
}
