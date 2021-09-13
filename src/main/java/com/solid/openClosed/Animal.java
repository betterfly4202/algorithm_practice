package com.solid.openClosed;

/**
 *  https://en.wikipedia.org/wiki/Open%E2%80%93closed_principle
 *
 *  확장에 대해선 개방
 *  수정에 대해선 폐쇄
 *
 *  => 코드에 대한 제어가 아닌, 코드의 행위에 대한 내용
 */
public class Animal {
    String a_type;
    public Animal(String a_type){
        this.a_type = a_type;
    }

    public void hey(){
        if (this.a_type == "Cat"){
            System.out.println("meow");
        }else if(this.a_type == "Dog"){
            System.out.println("bark");
        }else{
            throw new IllegalArgumentException("wrong a_type");
        }
    }


    /*
        만약 위 코드에서 '소' 또는 '양' 같은 동물이 추가 된다면?
        if-else에 소, 또는 양을 또 추가해줘야한다.

        Open-Closed 원칙에서 확장에는 열려있고 수정은 불가능해야 한다고 했는데,
        소와 양 같은 동물을 추가하기 위해선 hey() 메서드를 수정할 수 밖에 없다.

        이런 문제를 해결하기 위해서 Interface 혹은 Abstract class 의 도움이 필요하다.
     */
}
