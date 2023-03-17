package javaprogramming.week3;

import java.util.Scanner;

public class Exam05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("두 개의 정수를 입력해주세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        /*if(a>=b){
            System.out.println(a + "-" + b + " = " + (a-b));
        } else {
            System.out.println(b + "-" + a + "= " +(b-a));
        }*/
        System.out.println((a>b)?a-b:b-a);
        
        //나이 입력 조건 연산자 사용
    }
}
