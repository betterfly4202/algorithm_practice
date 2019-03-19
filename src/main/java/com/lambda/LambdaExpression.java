package com.lambda;

/**
 * Created by betterFLY on 2017-11-14.
 */
public class LambdaExpression {
    public static void main(String [] args){

        int a = 100;
        int b = 5;

        Func add=(int c, int d) -> {
            System.out.println("이것이 람다입니다 : "+c+d);
            return c+d;
        };
        System.out.println(add.calc(a,b));


        prac p;
        p = () ->
        {
          System.out.println("a와 b의 합은 ? "+a+b);
        };
        p.method();
    }

    @FunctionalInterface
    interface Func{
        public int calc(int a, int b);
    }

    @FunctionalInterface
    public interface prac{
        public void method();
    }


}
