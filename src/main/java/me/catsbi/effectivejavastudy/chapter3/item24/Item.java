package me.catsbi.effectivejavastudy.chapter3.item24;

public class Item {
    private String name;

    private NestedClass nestedClass;

    public Item(String name) {
        this.name = name;
        this.nestedClass = new NestedClass("nestecClassName-" + name);

    }

    public void printNames() {
        nestedClass.printNames();
    }

    private class NestedClass {
        private String name;

        public NestedClass(String name) {
            this.name = name;
        }

        public void printNames() {
            System.out.println("this.name = " + this.name);
            System.out.println("Item.this.name = " + Item.this.name);
        }
    }
}
