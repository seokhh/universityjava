package javaprogramming.week4.exam;

public class Exam05 {
    public static void main(String[] args){
        for(int i = 1; i<=9; i++){
            for(int k =2; k<=9; k++){
                System.out.print(k + " * " + i + " = " + (i*k) + " \t");
            }
            System.out.println();
        }
    }
}