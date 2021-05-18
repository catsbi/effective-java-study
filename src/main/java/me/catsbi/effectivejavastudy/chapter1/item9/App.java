package me.catsbi.effectivejavastudy.chapter1.item9;

import java.io.IOException;

public class App {
    private static final String PATH = "src/main/java/me/catsbi/effectivejavastudy/chapter1/item9/";
    public static void main(String[] args) throws IOException {
        StringUtils instance = StringUtils.getInstance();

        String s = instance.firstLineOfFile(PATH+"test.txt", PATH+"out.txt");
        System.out.println(s);

        String s1 = instance.firstLineOfFileV2(PATH + "test.txt", PATH + "out.txt");
        System.out.println(s1);
    }
}
