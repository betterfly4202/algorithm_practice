package com.solid.liskovSubstitution;

/**
 *  https://en.wikipedia.org/wiki/Liskov_substitution_principle
 *
 *  'S'가 'T'의 서브타입일때,
 *  Object 'T'는 object 'S'로 치환 가능하다.
 *
 *  말이 어렵다.
 *
 *        T
 *  S1 - S2- S3
 *
 *  이런 구조 일때, T는  S1,S2,S3로 바꿔도 치환이 가능해야 한다는 말이다.
 *
 *  예를들어 고양이 클래스 Cat이 있을때 {@link Cat}
 *  서브 타입인 {@link BlackCat} 클래스로 치환해도 정상적으로 동작이 가능하다는 말이다.
 *
 *  그런데 만약 여기서 성격이 다른 타입, 예를들어 생선{@link Fish} 클래스가 있다면,
 *  생선은 고양이와 성격이 다르므로, 고양이를 상속받은 생선클래스에서 speak()를 호출하면 예외가 발생한다.
 *  즉 다시 말해, 고양이(Cat)은 생선(Fish)로 치환될 수 없는 리스코프치환 원칙에 위배 되는 설계이다.
 */
public class Cat {
    public void speak(){
        System.out.println("meow");
    }
}
