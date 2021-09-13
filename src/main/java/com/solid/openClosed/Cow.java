package com.solid.openClosed;

public class Cow extends AnimalExtend{

    public Cow(String name, String crying) {
        super(name, crying);
    }

    @Override
    void speak() {
        System.out.println(this.crying);
    }
}
