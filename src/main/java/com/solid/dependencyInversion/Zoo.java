package com.solid.dependencyInversion;

import java.util.ArrayList;
import java.util.List;

/**
    "high-level을 low-level로 의존성을 역전시킨다는 개념"

    예를들어 동물원(Zoo)클래스가 있고
    여기에 존재하는 Cat, Dog 클래스가 있다.

    이 구조에서 High-level은 Zoo클래스가 될 것이고,
    Cat, Dog는 low-level의 클래스구조가 된다.

    즉 동물원(Zoo)은 강아지(Dog)와 고양이(Cat)에 Dependency가 존재하는 것이다.
    이처럼 High-Level의 모듈(Zoo)이 Low-level의 의존성을 갖는 것이 직관적이고 자연스러운 것으로 보인다.

    그런데 만약 여기에 몇개의 동물이 추가된다고 생각해보자.
    예를들어 양(Sheep), 소(Cow) 등이 추가된다고 생각하자.
    그러면 {@link Cat}, {@link Dog}와 마찬가지로 동일한 인터페이스를 갖고 있는 Low-level의 모듈이 추가되며 상위 레벨의 객체에 의존성이 추가된다.

    이렇게 계속해서 high-level module에서의 의존성이 추가된다면, low-level의 증가에 따라 코드의 수정 및 관리에 어려움을 겪을 수 있다.

    이를 해결하기 위해서 dependency inversion을 사용한다.

    그러면 위 구조의 모듈을 다음과같이 해결할 수 있다.
    [기존]
    Zoo -> Cat
        -> DOg

    [개선]
    Zoo -> Animal <- Cat
                  <- Dog

    즉 이를 개선하면 다음과 같이 개선할 수 있겠다.
    먼저 동물들의 모든 역할을 추상화하고 있는 abstract class {@link Animal} 클래스를 생성한다.
    그리고 이 Animal클래스를 구현할 실제 구현체인 {@link AbstractDog}, {@link AbstractCat} 클래스를 생성하고
    실제 동물들의 성격에 맞도록 인터페이스를 구현한다.

    그리고 최종적으로 이것을 담을 동물원(Zoo)에서는 Animal클래스만을 통해서 모든 동물들의 역할을 동적으로 관리할 수 있게된다.
    이렇게 설계할 경우 이후 Sheep, Cow등의 동물이 추가되더라도 High-level인 Zoo클래스의 변경이 필요없게 된다.

    이처럼 전통적인 의존관계(High level -> Low level)를 형성하는것이 아닌,
    중간에 추상화 계층을 두고 의존관계의 방향을 반대로 (Low level -> 추상계층(interface/abstract class)) 역전시키는 것을
    Dependency Inversion이라고 부른다.
 */
public class Zoo {
    private Dog dog;
    private Cat cat;
    public Zoo(Dog dog, Cat cat){
        this.dog = dog;
        this.cat = cat;
    }


    private List<Animal> animals;
    public Zoo(){
        this.animals = new ArrayList<>();
    }

    public void add(Animal animal){
        animals.add(animal);
    }

    public void speakAnimals(){
        for (Animal animal : animals) {
            animal.speak();
        }
    }

    public static void main(String[] args) {
        // high level module -> low level module의 일반적인 의존관계
        Zoo zoo = new Zoo(new Dog(), new Cat());
        zoo.cat.speak();
        zoo.dog.speak();

        // dependency inversion을 이용한 의존관계 역전
        Zoo inversionZoo = new Zoo();
        inversionZoo.add(new AbstractDog());
        inversionZoo.add(new AbstractCat());
        inversionZoo.speakAnimals();
    }
}