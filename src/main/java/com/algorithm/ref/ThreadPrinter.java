package com.algorithm.ref;

/**
 * Created by betterFLY on 2018. 8. 19.
 * Github : http://github.com/betterfly88
 */

public class ThreadPrinter implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("new Thread..." + Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}