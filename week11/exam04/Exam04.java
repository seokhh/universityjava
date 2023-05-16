package javaprogramming.week11.exam04;

abstract class Shape{
    String name;
    public Shape(String name){
        this.name = name;
    }
    public void draw(){
        System.out.println("도형을 그리기");
    }
    abstract public void area(double a, double b);
//추상메서드 선언 반드시 추상클래스에 정의해야함

}
class Circle extends Shape {

    public Circle(String name) {
        super(name);
    }

    public void draw(){
        System.out.println(super.name+"을 그리는 기능");
    }
    public void area(double a, double b){
        System.out.println(super.name+"의 넓이: " + Math.PI * a * b);
    }
}
class Rectangle extends Shape {

    public Rectangle(String name) {
        super(name);
    }

    public void draw()
        {
            System.out.println(super.name+"을 그리는 기능");
        }
    public void area(double a, double b){
        System.out.println(super.name+"의 넓이: " + a*b);
    }
}
class Triangle extends Shape {

    public Triangle(String name) {
        super(name);
    }

    public void draw()
        {
            System.out.println(super.name+"을 그리는 기능");
        }
    public void area(double a, double b){
        System.out.println(super.name+"의 넓이: " + (a*b)/2);
    }
}
public class Exam04 {
    public static void main(String[] args){
        Shape[] s = new Shape[3];
        //Shpae s1 = new Shape(); 추상클래스는 자기자신을 객체화 할 수 없음
        //자식클래스를 통해 추상메서드를 구현하는게 목적
        s[0] = new Circle("원");
        s[1] = new Rectangle("사각형");
        s[2] = new Triangle("삼각형");
        for(Shape list : s){
            list.draw();
            list.area(5,5);
        }
    }
}