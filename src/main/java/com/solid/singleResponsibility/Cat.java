package com.solid.singleResponsibility;

/**
 * https://en.wikipedia.org/wiki/Single-responsibility_principle
 *
 * Class, Module, Function은 각각 하나의 역할만 수행해야 한다.
 */
public class Cat {
    int age;
    String name;
    public Cat(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void eat(){

    }

    public void walk(){

    }

    public String representation(){
        return String.format("age  : {}, name : {}", this.age, this.name);
    }
}
