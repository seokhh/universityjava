package javaprogramming.week4;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args){
        //계속 정수를 입력받아 짝수인지 홀수 인지 판별( 0 입력받으면 종료)
        Scanner sc = new Scanner(System.in);
        int a;
        while (true){
            System.out.print("정수를 입력해주세요: ");
            a = sc.nextInt();
            if(a == 0)
            {
                System.out.println("0입니다. 종료합니다.");
                break;
            } else if(a%2 == 0){
                System.out.println("짝수입니다.");
            } else {
                System.out.println("홀수입니다.");
            }
        }
    }
}
