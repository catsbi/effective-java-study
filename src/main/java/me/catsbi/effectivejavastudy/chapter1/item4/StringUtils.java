package me.catsbi.effectivejavastudy.chapter1.item4;

public abstract class StringUtils {

    //인스턴스화 방지 생성자.
    private StringUtils() {
        throw new AssertionError();
    }

    public static void print(String message) {
        System.out.println(message);
    }
}

/*StringUtils의 기본생성자가 private 생성자가 되며 상속이 불가능해진다.*/
/*public class StringUtilsChild extends StringUtils{

    public StringUtilsChild() {
        super();
    }
}*/
