package javaprogramming.week15.class1.exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Exam01 {
    public static void main(String[] args){
        FileInputStream in = null;
        try {
            in = new FileInputStream("c:\\java\\input.txt");
            int c; //왜 int냐면 0~255 1바이트 단위로 읽어옴
            while ((c=in.read()) != -1){
                System.out.print((char)c);
            }
            in.close();
        }catch (IOException e){
            System.out.println("입출력 오류");
        }
    }
}
