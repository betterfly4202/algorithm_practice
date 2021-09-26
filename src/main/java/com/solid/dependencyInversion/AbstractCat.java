package com.solid.dependencyInversion;

public class AbstractCat extends Animal{

    @Override
    public void speak() {
        System.out.println("meow");
    }
}
