package javaprogramming.week14.exam02;

import java.util.Vector;

// 클래스 Point x,y 좌표멤버변수 접근제한 생성자 초기화
class Point{
    private int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+ x + ", " + y + ")";
    }
}
public class Exam02 {
    public static void main(String[] args){
        //vector 클래스 이용하여 위에 정의된 포인터 클래스에 값을 추가하고 출력
        Vector<Point> v = new Vector<>();
        v.add(new Point(10, 5));//객체 인스턴스화 기억하기 시험문제 나올 수도 있음
        v.add(new Point(5, 5));
        v.add(new Point(100, 50));
        for(Point list:v){
            System.out.println(list);
        }
        System.out.println("======================");
        //v.add(1, new Point(20,20));
        v.remove(1);
        for(int i = 0; i < v.size(); i++){
            System.out.println(v.get(i));
        }
    }
}