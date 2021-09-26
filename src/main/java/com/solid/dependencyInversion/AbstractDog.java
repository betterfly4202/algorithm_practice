package com.solid.dependencyInversion;

public class AbstractDog extends Animal{

    @Override
    public void speak() {
        System.out.println("bark");
    }
}
