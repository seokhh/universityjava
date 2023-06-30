package javaprogramming.week15.class2.exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam04 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("c:\\java\\바탕화면용 ppt.png");
        FileOutputStream out = new FileOutputStream("c:\\java\\바탕화면.png");
        int c;
        while ((c=in.read()) != -1){
            out.write(c);
        }
        in.close();
        out.close();
        System.out.println("복사가 완료~");
    }
}