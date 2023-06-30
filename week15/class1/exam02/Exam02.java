package javaprogramming.week15.class1.exam02;

import java.io.FileOutputStream;
import java.io.IOException;

public class Exam02 {
    public static void main(String[] args){
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("c:\\java\\out.txt");
            String str ="이 문자를 파일에 기록하고 싶습니다";
            byte[] buf = str.getBytes();
            out.write(buf);
        } catch (IOException e){
            System.out.println("입출력 오류");
        }
        System.out.println("파일쓰기 완료~");
    }
}
