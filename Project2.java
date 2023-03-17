package javaprogramming.week3;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수식을 입력하세요: ");
        String[] arr = new String[3];
        for(int i = 0; i<3; i++){
        arr[i] = sc.next();
        }
        /*if (arr[1].equals("+")) {
            int result1 = (Integer.parseInt(arr[0])) + (Integer.parseInt(arr[2]));
            System.out.print(arr[0] + "+" +arr[2] + "=" + result1);
        } else if (arr[1].equals("-")) {
            int result2 = (Integer.parseInt(arr[0])) - (Integer.parseInt(arr[2]));
            System.out.print(arr[0] + "-" +arr[2] + "=" + result2);
        } else if (arr[1].equals("*")) {
            int result3 = (Integer.parseInt(arr[0])) * (Integer.parseInt(arr[2]));
            System.out.print(arr[0] + "X" +arr[2] + "=" + result3);
        } else if (arr[1].equals("/")) {
            double result4 = (Double.parseDouble(arr[0])) / (Double.parseDouble(arr[2]));
            System.out.print(arr[0] + "/" +arr[2] + "=" + result4);
        }*/
        switch (arr[1]){
            case "+" -> {
                int result1 = (Integer.parseInt(arr[0])) + (Integer.parseInt(arr[2]));
                System.out.print(arr[0] + "+" + arr[2] + "=" + result1);
            }
            case "-" -> {
                int result2 = (Integer.parseInt(arr[0])) - (Integer.parseInt(arr[2]));
                System.out.print(arr[0] + "-" +arr[2] + "=" + result2);
            }
            case "*" -> {
                int result3 = (Integer.parseInt(arr[0])) * (Integer.parseInt(arr[2]));
                System.out.print(arr[0] + "X" +arr[2] + "=" + result3);
        }
            case "/" -> {
                double result4 = (Double.parseDouble(arr[0])) / (Double.parseDouble(arr[2]));
                System.out.print(arr[0] + "/" +arr[2] + "=" + result4);
            }
        }
    }
}
