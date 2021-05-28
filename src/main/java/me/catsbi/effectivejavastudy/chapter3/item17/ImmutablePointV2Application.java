package me.catsbi.effectivejavastudy.chapter3.item17;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ImmutablePointV2Application {
    private static ImmutablePointV2 point = new ImmutablePointV2(1, 2);

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
    private static class ImmutablePointV2 {
        public static final ImmutablePointV2 ZERO = new ImmutablePointV2(0, 0);
        public static final ImmutablePointV2 ONE = new ImmutablePointV2(1, 0);
        public static final ImmutablePointV2 I = new ImmutablePointV2(0, 1);

        private final double x;
        private final double y;

        private ImmutablePointV2(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public static ImmutablePointV2 valueOf(double x, double y) {
            return new ImmutablePointV2(x, y);
        }

        public ImmutablePointV2 move(double x, double y) {
            return new ImmutablePointV2(this.x + x, this.y + y);
        }

        @Override
        public String toString() {
            return "[" + x + ", " + y + "]";
        }
    }
}
