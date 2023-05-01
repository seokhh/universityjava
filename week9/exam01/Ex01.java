package javaprogramming.week9.exam01;

import selfjava.Chap7.sec01.exam07.pack2.C;

//상위클래스 Point 멤버변수 x, y 메서드 show()
//하위클래스 ColorPoint 멤버변수 color 메서드 showColor()
class Point{
    private int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void show(){
        System.out.println("(" + x + ", " + y + ")");
    }
}
class ColorPoint extends Point //상속 : extends,

{
    private String color;
    //super.멤버변수 = 값;  super.메서드()
    //상속받은 부모클래스가 생성자로 정의되어있으면 반드시 자식클래스도 생성자로 정의
    public ColorPoint(int x, int y, String color){
        //3. 부모클래스의 생성자를 호출할 때는 super
        super(x,y); //부모클래스에 정의되어있는 생성자 호출 생성자가 2개 차있으면 2개로 해야함
        this.color=color;
    }
    public void colorShow(){
        System.out.print(color);
        super.show(); //여기서 호출해도 됨
    }
}
public class Ex01 {
    public static void main(String[] args){
        ColorPoint cp = new ColorPoint(10,10,"blue");
        /*
        cp.color="red";
        cp.x=10;
        cp.y=10;*/
        cp.colorShow();
        //cp.show();
    }
}
//