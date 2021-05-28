package me.catsbi.effectivejavastudy.chapter3.item17;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ImmutablePointApplication {
    private static ImmutablePoint point = new ImmutablePoint(1, 2);

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            System.out.println("Thread: "+Thread.currentThread().getName());
            System.out.println("future1 point = " + point);
        });

        CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
            System.out.println("Thread: "+Thread.currentThread().getName());
            point = point.move(3, 4);
            System.out.println("future2 point = " + point);
        });

        CompletableFuture<Void> allOf = CompletableFuture.allOf(future1, future2);
        allOf.get();

    }

    @Data
    @AllArgsConstructor
    private static class ImmutablePoint {
        public static final ImmutablePoint ZERO = new ImmutablePoint(0, 0);
        public static final ImmutablePoint ONE = new ImmutablePoint(1, 0);
        public static final ImmutablePoint I = new ImmutablePoint(0, 1);

        private final double x;
        private final double y;

        public ImmutablePoint move(double x, double y) {
            return new ImmutablePoint(this.x + x, this.y + y);
        }

        @Override
        public String toString() {
            return "[" + x + ", " + y + "]";
        }
    }

}
