package javaprogramming.week3;

import java.util.Scanner;

public class Month {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("일을 알고 싶은 달을 입력하세요: ");
        int month = sc.nextInt();
        int day;
        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                day = 28;
                break;
            default:
                day = 31;
                break;
        }
        System.out.println(day + "일 입니다.");
    }
}