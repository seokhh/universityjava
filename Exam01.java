package javaprogramming.week3;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("두 개의 정수 입력: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+ "+" + b + "=" + (a+b));
        System.out.println(a+ "-" + b + "=" + (a-b));
        System.out.println(a+ "*" + b + "=" + (a*b));
        System.out.println(a+ "/" + b + "=" + (a/b));
        System.out.println(a+ "을" + b + "로 나눈 나머지 값: " + (a%b));
    }
}
