package javaprogramming.week6.exam;
import java.util.Scanner;

//Rectangle 클래스 정의 : 가로 세로 길이를 곱하여 면적 출력
// 멤버 변수 가로 세로 2개
// 메소드 면적 구하는 공식 가로 * 세로 메소드 반환
// 객체를 생성하여 가로 세로 값을 우리가 저장하고 메소드 호출해서 출력
class Rectangle{
    int col;//가로
    int row;//세로
    int area() {
        return col * row;
    }
    double area(double c, double r){
        return c*r;
    }
}
public class Exam02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();//디폴트 생성자 호출
        System.out.print("가로 길이를 정하세요: ");
        rectangle.col = sc.nextInt();
        System.out.print("세로 길이를 정하세요: ");
        rectangle.row = sc.nextInt();
        System.out.println("정수형 사각형의 넓이: " + rectangle.area());
        System.out.println("실수형 사각형의 넓이: " + rectangle.area(5.5,12.2));
    }
}