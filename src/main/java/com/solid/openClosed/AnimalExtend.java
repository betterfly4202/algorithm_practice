package com.solid.openClosed;

public abstract class AnimalExtend {
    String name;
    String crying;

    public AnimalExtend(String name, String crying){
        this.name = name;
        this.crying = crying;
    }

    abstract void speak();
}
