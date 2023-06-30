package javaprogramming.week15.class1.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam03 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("c:\\java\\out.txt");
        FileOutputStream out = new FileOutputStream("c:\\java\\outcopy.txt");
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }
        System.out.println("복사가 완료되었습니다.");
    }
}
