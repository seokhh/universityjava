package javaprogramming.week2.exam1.no4;
import java.util.Scanner;
public class ScannerEx {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");

        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("도시: ");
        String city = sc.nextLine();

        System.out.print("나이: ");
        int age = sc.nextInt();

        System.out.print("체중: ");
        double weight = sc.nextDouble();

        System.out.print("독신여부: ");
        String ox = sc.next();
        if(ox.equals("o")){
            ox = "솔로";
            System.out.print(name + ", " + city + ", " + age+ ", " + weight+ ", " + ox + "입니다.");
        } else if(ox.equals("x")){
            ox= "커플";
            System.out.print(name + ", " + city + ", " + age+ ", " + weight+ ", " + ox + "입니다.");
        } else {
            System.out.print("다시 입력해주세요");
        }
    }
}
