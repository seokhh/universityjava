package javaprogramming.week2.check.no1;
import java.util.Scanner;
public class Orange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("오렌지의 개수를 입력하세요: ");
        int orange = sc.nextInt();

        int box = orange/10;
        int result = orange%10;

        System.out.print(box + "박스가 필요하고 " + result + "개가 남습니다.");
    }
}
