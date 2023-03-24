package javaprogramming.week4;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args){
        //5개 정수 입력받아 입력 받은 수의 합을 출력 단 음수인 수는 제외하고 합을 출력
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int a;
        int num = 0;
        int under = 0;
        for(int i =1; i<=5; i++){
            System.out.print(i + "번째 입력: ");
            a = sc.nextInt();
            if(a < 0) continue;
            else
                sum += a;
            under++;
        }
        num = 5-under;
        System.out.println("음수를 빼고 더 한 수: " + sum);
        System.out.println("음수를 입력한 횟수: " + num);
    }
}
