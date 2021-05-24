package me.catsbi.effectivejavastudy.chapter2.item13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foods implements Cloneable{
    private final List<Food> store = new ArrayList<>();

    public Foods() { }

    public void add(Food food) {
        store.add(food);
    }

    public Food get(int index) {
        return store.remove(index);
    }

    public List<Food> getAll() {
        return new ArrayList<>(store);
    }

    @Override
    public Foods clone(){
        try{
            return (Foods)super.clone();
        }catch(CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Foods{" + Arrays.toString(store.toArray()) + '}';
    }
}
