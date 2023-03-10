package javaprogramming.week2.project;
import java.util.Scanner;
public class SumandAvg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수를 입력해주세요: ");
        int korea = sc.nextInt();

        System.out.print("수학 점수를 입력해주세요: ");
        int math = sc.nextInt();

        System.out.print("영어 점수를 입력해주세요: ");
        int english = sc.nextInt();

        int sum = korea + math + english;
        System.out.println("세 과목의 점수의 총 합은 " +sum + "점 입니다.");

        double avg = (double) (korea + math + english) / 3;
        System.out.print("세 과목의 평균은 " + avg + "점 입니다.");
    }
}