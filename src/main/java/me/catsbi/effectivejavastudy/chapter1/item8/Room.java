package me.catsbi.effectivejavastudy.chapter1.item8;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Room implements AutoCloseable {
    public static final List<Long> times = new ArrayList<>();
    private String name;
    private long nanoTime;

    public Room(String name) {
//        System.out.println("created room");
        this.name = name;
        this.nanoTime = System.nanoTime();
    }

    public static void clear() {
        times.clear();
    }

    @Override
    public void close() throws Exception {
//        System.out.println("close 소요시간: "+ (System.nanoTime() - nanoTime));
        times.add(System.nanoTime() - nanoTime);
    }

    public static long averageTime() {
        Long aLong = times.stream().reduce(Long::sum).get();
        return Math.floorDiv(aLong, times.size());
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
        times.add(System.nanoTime() - nanoTime);
    }
}
