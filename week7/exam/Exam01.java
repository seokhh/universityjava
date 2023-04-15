package javaprogramming.week7.exam;

import java.util.Scanner;

//클래스 cirlce
//상태: 반지름 동작: 반지름으로 원의 면적을 반환하는 메서드 정의
//생성자: 반지름을 초기화하는 생성자 정의
//객체배열을 1-개 선언하고 반지름 1부터 10까지 값을 초기화하여 면적을 출력
class Circle{
    double r;
    Circle(double r){
        this.r = r;
    }
    double area(){
        return r*r*3.14;
    }
}
public class Exam01 {
    public static void main(String[] args){
        Circle[] circle = new Circle[10];
        for (int i =0; i<circle.length; i++){
            circle[i] = new Circle(i+1);//()안이 비어있으면 디폴트 생성자가 되기때문에 안됨
        }
        for(Circle list: circle){
            System.out.print(list.area() + " ");
        }
    }
}
