package com.solid.openClosed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    public void 동물_울음소리(){
        Animal kitty = new Animal("Cat");
        Animal bingo = new Animal("Dog");

        kitty.hey();
        bingo.hey();
    }


    @Test
    public void 개방폐쇄원칙_동물_울음소리(){
        AnimalExtend cat = new Cat("coco", "meow");
        AnimalExtend cow = new Cow("so~~w", "moo");

        cat.speak();
        cow.speak();

        cow.crying = "dd";
        cat.speak();
        cow.speak();
    }
}