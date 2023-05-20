package javaprogramming.week12.exam03;
// 리모컨 인터페이스 turnon turnoff 선언
// 상속받는 자식클래스 tv refrigerator 인터페이스 메서드 구현
interface RemoteControl {
    public void turnOn();
    public void turnOff();
}
class Tv implements RemoteControl{

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
}
class Refrigerator implements RemoteControl{

    @Override
    public void turnOn() {
        System.out.println("냉장고를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("냉장고를 끕니다.");
    }
}
public class Exam03 {
    public static void main(String[] args){
        RemoteControl rc1 = new Tv();
        RemoteControl rc2 = new Refrigerator();

        rc1.turnOn();
        rc1.turnOff();
        rc2.turnOn();
        rc2.turnOff();
    }
}
