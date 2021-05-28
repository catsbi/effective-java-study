package me.catsbi.effectivejavastudy.chapter3.item17;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class MutablePointApplication {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MutablePoint point = new MutablePoint(1, 2);

        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            System.out.println("Thread: "+Thread.currentThread().getName());
            System.out.println("future1 point = " + point);
        });

        CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
            System.out.println("Thread: "+Thread.currentThread().getName());
            point.x += 5;
            System.out.println("future2 point = " + point);
        });

        CompletableFuture<Void> allOf = CompletableFuture.allOf(future1, future2);
        allOf.get();
    }

    @Data
    @AllArgsConstructor
    private static class MutablePoint {
        public double x;
        public double y;


        @Override
        public String toString() {
            return "[" + x + ", " + y + "]";
        }
    }
}
