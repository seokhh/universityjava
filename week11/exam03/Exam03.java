package javaprogramming.week11.exam03;

import selfjava.Chap7.sec01.exam07.pack2.C;

// 부모클래스 car 멤버변수 oil
// car 상속받는 자식 Hibrid 멤버변수 elec
// HIbrid 상속받는ㄴ 자식 Wcar 멤버변수 water
class Car {
    private int oil;
    public Car(int oil){
        this.oil = oil;
    }
    public void disp(){
        System.out.println("기름의 잔여량: " + oil + ", ");
    }
}
class Hibrid extends Car{
    private int elec;

    public Hibrid(int oil, int elec){
        super(oil);
        this.elec = elec;
    }
    @Override
    public void disp() {
        super.disp();
        System.out.println("전기의 잔여량: " + elec);
    }
}
class Wcar extends Hibrid {
    private int water;
    public Wcar(int oil, int elec, int water){
        super(oil, elec);
        this.water = water;
    }

    @Override
    public void disp() {
        super.disp();
        System.out.println("수소의 잔여량: " + water);
    }
}
public class Exam03 {
    public static void main(String[] args){
        Car[] c = new Car[3];
        c[0] = new Car(50);
        c[1] = new Hibrid(20,20);
        c[2] = new Wcar(40,40,40);
        for(Car list : c){
            list.disp();
        }
    }
}
