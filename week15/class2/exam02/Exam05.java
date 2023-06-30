package javaprogramming.week15.class2.exam02;

import java.io.FileReader;
import java.io.IOException;

public class Exam05 {
    public static void main(String[] args){
        try {
            FileReader in = new FileReader("c:\\java\\out.txt");
            int c;
            while ((c=in.read()) != -1){
                System.out.print((char)c);
            }
        } catch (IOException e){
            System.out.println("파일 입출력 오류");
        }
    }
}