package javaprogramming.week4.exam;

import java.util.Scanner;

public class Exam02 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단 단을 입력하세여요:");
        int a = sc.nextInt();
        int i =1;
        while(i<=9){
            System.out.println(a + "*" + i+" = " + (a*i));
            i++;
        }
    }
}
