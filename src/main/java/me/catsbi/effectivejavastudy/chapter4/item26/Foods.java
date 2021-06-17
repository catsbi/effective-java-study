package me.catsbi.effectivejavastudy.chapter4.item26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Foods {
    private final List<Food> store = new ArrayList();

    public Foods() { }

    public void add(Food obj) {
        store.add(obj);
    }

    public void print(){
        for (Iterator<Food> it = store.iterator(); it.hasNext();) {
            Food food = it.next();
            System.out.println("food = " + food);
        }
    }
}
