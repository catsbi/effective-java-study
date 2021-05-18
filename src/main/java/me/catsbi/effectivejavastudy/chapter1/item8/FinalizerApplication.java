package me.catsbi.effectivejavastudy.chapter1.item8;

public class FinalizerApplication {
    public static void main(String[] args) throws Throwable {

        for (int i = 0; i < 10000; i++) {
            try (Room room = new Room("test" + i)) {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("try-with-resource average time:" + Room.averageTime());

        for (int i = 0; i < 10000; i++) {
            Room test2 = null;
            try {
                test2 = new Room("test" + i);
            } catch (Exception e) {
                e.printStackTrace();
            }
            test2.finalize();
        }
        System.out.println("finalizer average time:" + Room.averageTime());
    }
}
