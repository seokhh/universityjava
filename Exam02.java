package javaprogramming.week3;
import java.util.Scanner;
public class Exam02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("사과의 개수를 입력하세요: ");
        int apple = sc.nextInt();

        int box = apple/10;
        int result = apple%10;

        System.out.print(box + "박스가 필요하고 사과는 " + result + "개가 남습니다.");
    }
}