package com.solid.liskovSubstitution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    public void 리스코프_치환(){
        Cat cat = new Cat();
        cat.speak();

        cat = new BlackCat();
        cat.speak();
    }
}