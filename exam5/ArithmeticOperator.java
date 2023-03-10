package javaprogramming.week2.exam1.no5;
import java.util.Scanner;
public class ArithmeticOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하시오: ");
        int time = sc.nextInt();

        int hour = (time/60)/60;
        int minute = (time/60)%60;
        int second = time %60 ;
        System.out.print(time +"은 " + hour+"시간 " + minute+ "분 " + second + "초 입니다.");
    }
}