package javaprogramming.week4;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args){
        //입력받은 정수 합을 출력(0입력하면 종료) 몇개입력받고 합이 얼마인지 출력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int num = 0;
        while(a != 0){
            sum += a;
            a = sc.nextInt();
            num ++;
        }
        if(num == 0)
            System.out.println("입력된 수가 없습니다.");
        System.out.println("총합: " + sum);
        System.out.println("입력받은 수의 개수: " + num);
    }
}
