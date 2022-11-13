package com.kanni;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadNumberPrintExample {

    static AtomicInteger atomicInteger=new AtomicInteger(1);
    static AtomicBoolean firstflag=new AtomicBoolean(true);
    static AtomicBoolean secondflag=new AtomicBoolean(false);
    static AtomicBoolean thirdfalg=new AtomicBoolean(false);

    final static int print=50;

    public static void main(String[] args) {
        new FirstThread().start();
        new SecondThread().start();
        new ThirdThread().start();

    }

    static class FirstThread extends Thread {

        @Override
        public void run() {
            setName("Thread 1");
            while(atomicInteger.get() < print ){
                if(firstflag.get()) {
                    System.out.println(ThirdThread.currentThread().getName() + "    " + atomicInteger.getAndIncrement());
                    secondflag.set(true);
                    firstflag.set(false);
                }
            }
            System.out.println("  completed!!" +ThirdThread.currentThread().getName());
        }
    }
    static class SecondThread extends Thread {

        @Override
        public void run() {
            setName("Thread 2");
            while(atomicInteger.get() < print ){
                if(secondflag.get()) {
                    System.out.println(ThirdThread.currentThread().getName() + "    " + atomicInteger.getAndIncrement());
                    secondflag.set(false);
                    thirdfalg.set(true);
                }
            }
            System.out.println(" completed!!"+ThirdThread.currentThread().getName() );
        }
    }
    static class ThirdThread extends Thread {

        @Override
        public void run() {
            setName("Thread 3");
            while(atomicInteger.get() < print ){
                if(thirdfalg.get()) {
                    System.out.println(ThirdThread.currentThread().getName() + "    " + atomicInteger.getAndIncrement());
                    thirdfalg.set(false);
                    firstflag.set(true);
                }
            }
            System.out.println("  completed!!" +ThirdThread.currentThread().getName());
        }
    }
}
