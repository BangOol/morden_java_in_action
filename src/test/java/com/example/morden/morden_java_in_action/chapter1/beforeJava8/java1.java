package com.example.morden.morden_java_in_action.chapter1.beforeJava8;

import com.example.morden.morden_java_in_action.chapter1.ConcurrentExecutableEnvironment;
import org.junit.jupiter.api.Test;

public class java1 {
    public class MyRunnable implements Runnable {
        public void run() {
            try {
                System.out.println("MyRunnable" + Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println("MyRunnable error" + Thread.currentThread().getName());
            }
        }
    }

    public class Counter {
        private int count = 0;
        public synchronized void increment() {
            count++;
        }
        public synchronized int getCount() {
            return count;
        }
    }

    @Test
    // 자바 1.0 - 1.1 : 기본 Thread 지원
    public void 자바1() {
        // 병렬로 수행할 작업을 Runnable 객체로 만들어 Thread 생성자에 넘긴다.
        Thread thread1 = new Thread(new java1.MyRunnable());
        Thread thread2 = new Thread(new java1.MyRunnable(){
            public void run() {
                for(int i =0; i < 100; i++) {
                    java1.Counter counter = new java1.Counter();
                    counter.increment();
                }
            }
        });
        Thread thread3 = new Thread(new java1.MyRunnable(){
            public void run() {
                for(int i =0; i < 100; i++) {
                    java1.Counter counter = new java1.Counter();
                    counter.increment();
                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (Exception e) {
            System.out.println("자바1 error" + Thread.currentThread().getName());
        }

        System.out.println("자바1" + Thread.currentThread().getName());
    }


}
