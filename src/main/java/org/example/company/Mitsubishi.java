package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
     return "Mitsubishi engine is starting";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi accelerating";
    }

    @Override
    public String startEngine() {
        return "Mitsubishi is braking";
    }
}
