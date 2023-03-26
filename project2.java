package javaprogramming.week4.project;

import java.util.Scanner;

//5개의 정수 입력받아 합계와 받은 수의 평균 구하기 (출력) for-each 써서 출력
public class project2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 5개를 입력하세요: ");
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        System.out.println("입력한 정수의 총 합: " + sum);
    }
}
