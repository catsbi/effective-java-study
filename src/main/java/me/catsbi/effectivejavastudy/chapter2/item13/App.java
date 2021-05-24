package me.catsbi.effectivejavastudy.chapter2.item13;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Food apple = new Food("사과", 1000);
        Food copiedApple = (Food) apple.clone();

        System.out.println("copiedApple = " + copiedApple);
    }

    static class Food {
        private String name;
        private long price;

        public Food(String name, long price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Food{name='" + name + '\'' + ", price=" + price + '}';
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
