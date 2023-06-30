package javaprogramming.week15.class2.exam03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exam06 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("c:\\java\\input.txt"));
        String str;
        while (true){
            str=in.readLine();
            if(str==null){
                break;
            }
            System.out.println(str);
        }
        in.close();
    }
}
