package me.catsbi.effectivejavastudy.chapter1.item9;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class StringUtils {
    private static final StringUtils instance = new StringUtils();

    private StringUtils() {
    }

    public static StringUtils getInstance() {
        return instance;
    }

    //worst case
    //try 문이 중복되어 가독성도 떨어질뿐 아니라 자원을 명시적으로 closing하는 것도 지저분하다.
    public String firstLineOfFile(String path, String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        try {
            FileOutputStream outputStream = new FileOutputStream(fileName);
            try {
                String s = reader.readLine();
                outputStream.write(s.getBytes(), 0, s.length());
            } finally {
                outputStream.close();
            }
            return reader.readLine();
        } finally {
            reader.close();
        }
    }

    //good case
    //try-with-resources를 사용한다.
    public String firstLineOfFileV2(String path, String fileName) throws IOException{
        try(BufferedReader reader = new BufferedReader(new FileReader(path));
            FileOutputStream out = new FileOutputStream(fileName)){

            String s = reader.readLine();
            out.write(s.getBytes(), 0, s.length());

            return s;
        }
    }


}
