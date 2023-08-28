package com.example.morden.morden_java_in_action.chapter1.beforeJava8;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Java5 {
    @Test
    public void 자바5() {
        // ExecutorService, ScheduledExecutorService, BlockingQueue 등을 이용한 동시성 유틸리티 도입
        // 스레드 풀을 더 쉽게 관리하고, 작업 큐를 사용하여 비동기 작업을 관리할 수 있게 되었다.
        // 스레드를 직접 생성하고 관리하는 대신, ExecutorService를 이용하여 스레드 풀을 생성하고 관리할 수 있다.
        // 고정된 크기(4)의 스레드 풀 생성
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        // 작업 제출 (Runnable 사용)
        Future<?> future1 = executorService.submit(new Runnable() {
            public void run() {
                System.out.println("Runnable Task: " + Thread.currentThread().getId());
            }
        });

        // 작업 제출 (익명 클래스 사용)
        Future<?> future2 = executorService.submit(new Runnable() {
            public void run() {
                System.out.println("Another Runnable Task: " + Thread.currentThread().getId());
            }
        });

        try {
            // 작업이 완료될 때까지 기다림
            future1.get();
            future2.get();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        // 스레드 풀 종료
        executorService.shutdown();
    }
}
