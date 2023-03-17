package javaprogramming.week2.check.no2;
import java.util.Scanner;
public class AdultorStudent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하시오: ");
        int age = sc.nextInt();

        if(age>=19){
            System.out.print("성인입니다.");
        } else {
            System.out.print("미성년자입니다.");
        }
    }
}
