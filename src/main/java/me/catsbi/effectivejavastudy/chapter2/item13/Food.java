package me.catsbi.effectivejavastudy.chapter2.item13;

public class Food implements Cloneable{
    private String name;
    private long price;

    public Food(String name, long price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public Food clone(){
        try{
            return (Food)super.clone();
        }catch(CloneNotSupportedException e){
            throw new AssertionError();//일어날 수 없는 일이다.
        }
    }
}
