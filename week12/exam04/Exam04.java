package javaprogramming.week12.exam04;
// 클래스 Car setSpeed(int speed) 메서드 정의
// 인터페이스 Flying  fly() 선언
// 인터페이스 Driving  drive() 선언 default 메서드 speed()
// 클래스 FlyCar car, flying driving 다중상속 출력
class Car{
    public void setSpeed(int speed) {
        System.out.println("자동차의 속도가 " + speed + "km로 변경");
    }
}
interface Flying{
    public void fly();
}
interface Driving{
    public void drive();
    default public void speed(){
        System.out.println("규정속도를 70km에 맞추었습니다.");
    }
}
class FlyCar extends Car implements Flying, Driving{

    @Override
    public void fly() {
        System.out.println("자동차가 날고 있습니다.");
    }

    @Override
    public void drive() {
        System.out.println("자동차가 달리는 모드로 변환되었습니다.");
    }
}
public class Exam04 {
    public static void main(String[] args){
        FlyCar car = new FlyCar();
        car.fly();
        car.drive();
        car.speed();
        car.setSpeed(100);
    }
}
