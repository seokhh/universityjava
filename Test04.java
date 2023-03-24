package javaprogramming.week4.test;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args){
        //5개의 정수를 입력받아서 배열에 저장입력받은 정수 중에서 최대값을 출력
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("1번째 정수 입력: ");
        arr[0]= sc.nextInt();
        int max = arr[0];
        for(int i = 1;i<arr.length; i++){
            System.out.print((i+1)+"번째 정수 입력: ");
            arr[i] = sc.nextInt();
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("가장 큰 수: " + max);
    }
}
