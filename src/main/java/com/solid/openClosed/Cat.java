package com.solid.openClosed;

public class Cat extends AnimalExtend{

    public Cat(String name, String crying) {
        super(name, crying);
    }

    @Override
    void speak() {
        System.out.println(this.crying);
    }
}
