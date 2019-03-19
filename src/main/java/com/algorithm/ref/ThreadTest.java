package com.algorithm.ref;

/**
 * Created by betterFLY on 2018. 8. 19.
 * Github : http://github.com/betterfly88
 */

public class ThreadTest {

    public static void main(String [] args) throws InterruptedException{
        final Thread separateThread = new Thread(new ThreadPrinter());
        separateThread.start();
        for(int i=0; i<5; i++){
            System.out.println("Main Thread..." + Thread.currentThread().getName());

            Thread.sleep(1000);
        }

    }
}

