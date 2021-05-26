package me.catsbi.effectivejavastudy.chapter2.item13;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Foods foods = new Foods();
        foods.add(new Food("사과", 1000));
        foods.add(new Food("귤", 2000));
        foods.add(new Food("배", 3000));

        Foods copiedFoods = foods.clone();
//        System.out.println("foods: "+ foods);
//        System.out.println("copiedFoods: "+copiedFoods);

        foods.get(0);
        System.out.println("foods: "+ foods);

        foods.get(1);
        System.out.println("foods: "+ foods);

        foods.get(2);
        System.out.println("foods: "+ foods);


        /*copiedFoods.add(new Food("딸기", 500));
        System.out.println("foods: "+ foods);
        System.out.println("copiedFoods: "+copiedFoods);*/
    }

    /*static class Food {
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
    }*/
}
