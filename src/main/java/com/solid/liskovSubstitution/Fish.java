package com.solid.liskovSubstitution;

public class Fish extends Cat{
    @Override
    public void speak() {
        throw new RuntimeException("생선은 말을 할 수 없습니다.");
    }
}
