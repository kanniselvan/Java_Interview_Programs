package com.kanni;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class ThreadNumberPrint1 {

    static AtomicInteger atomicInteger=new AtomicInteger(1);

    static AtomicReference<String> atomicReference=new AtomicReference<>("Thread 1");

    final static int print=50;

    public static void main(String[] args) {
        new FirstThread().start();
        new SecondThread().start();
        new ThirdThread().start();
        new FourthThread().start();

    }

    static class FirstThread extends Thread {

        @Override
        public void run() {
            setName("Thread 1");
            while(atomicInteger.get() < print ){
                if(atomicReference.get().equalsIgnoreCase("Thread 1")) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(FirstThread.currentThread().getName() + "    " + atomicInteger.getAndIncrement());
                    atomicReference.compareAndSet("Thread 1","Thread 2");
                }
            }
            System.out.println("  completed!!" + FirstThread.currentThread().getName());
        }
    }

    static class SecondThread extends Thread {

        @Override
        public void run() {
            setName("Thread 2");
            while(atomicInteger.get() < print ){
                if(atomicReference.get().equalsIgnoreCase("Thread 2")) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(SecondThread.currentThread().getName() + "    " + atomicInteger.getAndIncrement());
                    atomicReference.compareAndSet("Thread 2","Thread 3");
                }
            }
            System.out.println(" completed!!"+ SecondThread.currentThread().getName() );
        }
    }

    static class ThirdThread extends Thread {

        @Override
        public void run() {
            setName("Thread 3");
            while(atomicInteger.get() < print ){
                if(atomicReference.get().equalsIgnoreCase("Thread 3")) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(ThirdThread.currentThread().getName() + "    " + atomicInteger.getAndIncrement());
                    atomicReference.compareAndSet("Thread 3","Thread 4");
                }
            }
            System.out.println("  completed!!" + ThirdThread.currentThread().getName());
        }
    }

    static class FourthThread extends Thread {

        @Override
        public void run() {
            setName("Thread 4");
            while(atomicInteger.get() < print ){
                if(atomicReference.get().equalsIgnoreCase("Thread 4")) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(FourthThread.currentThread().getName() + "    " + atomicInteger.getAndIncrement());
                    atomicReference.compareAndSet("Thread 4","Thread 1");
                }
            }
            System.out.println("  completed!!" + FourthThread.currentThread().getName());
        }
    }
}
