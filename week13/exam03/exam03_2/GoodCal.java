package javaprogramming.week13.exam03.exam03_2;

import javaprogramming.week13.exam03.exam03_1.Calculator;

public class GoodCal extends Calculator {

    @Override
    public int add(int x, int y) {
        return x+y;
    }

    @Override
    public int subtract(int x, int y) {
        return x-y;
    }

    @Override
    public String toString() {
        return "계산 프로그램 완료";
    }

    public static void main(String[] args){
        GoodCal obj = new GoodCal();
        System.out.println(obj.add(100,200));
        System.out.println(obj.subtract(100,200));
        System.out.println(obj.getClass()); //java.lang.Object 클래스에 있는 메서드로 클래스이름 반환
        System.out.println(obj.hashCode()); //해시코드값
        System.out.println(obj.toString()); //객체이름으로 생략가능 ex)obj
    }
}