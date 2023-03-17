package javaprogramming.week3;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int grade = sc.nextInt();

        switch (grade / 10) {
            case 10, 9 -> System.out.print("A");
            case 8 -> System.out.print("B");
            case 7 -> System.out.print("C");
            case 6 -> System.out.print("D");
            default -> System.out.print("F");
        }
    }
}
