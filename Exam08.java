package javaprogramming.week4.exam;

import java.util.Scanner;

public class Exam08 {
    public static void main(String[] args){
        int[] arr1 = new int[10]; //배열 선언하고 크기
        for(int i =0; i< arr1.length; i++){
            arr1[i] = i+1;//초기화하여 값저장
            System.out.println("arr1[" + i+ "]" +" = "+ arr1[i] + " ");

        }
        System.out.println();
        int sum =0;
        int[] arr2 = {10, 20, 30, 40, 50};
        for(int i =0; i<arr2.length; i++){
            sum += arr2[i];
        }
        System.out.println(sum);

        System.out.println();

        String[] arr3 = {"apple","banana","strawberry"};
        for(int i =0; i<arr3.length; i++){
            System.out.println(arr3[i]);
        }
        System.out.println();
        int sum2 =0;
        int[] arr4 = {10, 20, 30, 40, 50};
        for(int n : arr4){ //for-each문 활용
            sum2 += n;
        }
        System.out.println(sum2);
        System.out.println();
        String[] arr5 = {"apple","banana","strawberry"};
        for(String fruit : arr5){
            System.out.println(fruit+ " ");
        }
    }
}