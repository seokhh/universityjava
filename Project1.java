package javaprogramming.week3;

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("수식을 입력하세요: ");
        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();
        
        if(b == '+')
            System.out.println(a+c);
        else if (b == '-') {
            System.out.println(a-c);
        } else if (b == '*') {
            System.out.println(a*c);
        } else if (b == '/') {
            System.out.println((double)a/c);
        }
    }
}