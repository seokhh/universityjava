package javaprogramming.week3;

import java.util.Scanner;

public class Exam08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("1~5 사이 정수 하나를 입력하세요: ");
        int a = sc.nextInt();
        
        switch (a){
            case 1:
                System.out.println("하나");
                //break;
            case 2:
                System.out.println("둘");
                break;
            default:
                System.out.println("수많은 숫자입니다.");
        }
    }
}