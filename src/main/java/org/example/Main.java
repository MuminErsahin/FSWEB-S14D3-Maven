package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());

        CarSkeleton carSkeleton = new CarSkeleton("Mmn", "Bu konu ne ya böyle beynimin belirli bölgelerini hissediyorum.");
        carSkeleton.startEngine();
        System.out.println(carSkeleton.toString());

        CarSkeleton electricCar = new ElectricCar("Ershn", "Bu gün sanki beynimle koştum", 100.10, 19);
        electricCar.startEngine();
        System.out.println(electricCar.toString());

        CarSkeleton gasPoweredCar = new GasPoweredCar("Ordu", " Bu konunun üzerine ne düşünmem gerektiğini bile bilmiyorum", 69.3, 5);
        gasPoweredCar.startEngine();
        System.out.println(gasPoweredCar.toString());

        CarSkeleton hybridCar = new HybridCar("Vona", "Ama yapabildiğimi görmek yine de güzel galiba ilahi güçler yardımcı oluyor", 52.2, 52,52);
        hybridCar.startEngine();
        System.out.println(hybridCar.toString());
   }


}