package javaprogramming.week3;

import java.util.Scanner;

public class Exam06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력하세요: ");
        int a = sc.nextInt();
        
        if(a>0)
            System.out.println("양수");
        else if(a<0)
            System.out.println("음수");
        else
            System.out.println("0은 양수도 음수도 아닙니다.");

    }
}
