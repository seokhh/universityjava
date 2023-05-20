package javaprogramming.week12.exam02;
/* 복습
* 추상클래스: 슈퍼클래스로 상속받은 서브클래스로 메서드 오버라이딩 목적
* 1.예약어: abstract
* 2.멤버변수, 생성자, 메서드, 추상메서드를 포함 될 수 있다.
* 3.다형성 구현
* 4.자기자신은 객체화 할 수 없다. (서브클래스로 객체화하여 메서드 동작)
* 추상메서드: 아무것도 정의되어있지 않는 메서드
* 1.예약어: abstract
* 2.일반클래스에 사용할 수 없다.
* 3.반드시 추상클래스에 선언 */

//animal 클래스
abstract class Animal{
    protected String name;

    abstract public void move();
}
class Mammal extends Animal{
    private int leg;
    public Mammal(String name, int leg){
        super.name = name;
        this.leg=leg;
    }
    @Override
    public void move() {
        System.out.println(name + "은(는) " + leg + "개의 다리로 다닙니다.");
    }
}
class Birds extends Animal{
    private int wings;
    public Birds(String name, int wings){
        super.name = name;
        this.wings = wings;
    }
    @Override
    public void move() {
        System.out.println(name + "은(는) " + wings + "개의 날개로 날아다닙니다.");
    }
}
public class Exam02 {
    public static void main(String[] args){
        Animal[] a = new Animal[100]; //배열의 수가 더 크면 널포인트익셉션이 발생함
        a[0] = new Mammal("사람", 2);
        a[1] = new Mammal("개", 4);
        a[2] = new Birds("독수리", 2);
        try {
            for (Animal list : a) {
                list.move();
            }
        }
        catch (NullPointerException e){
            System.out.println("==============================\n모든 값 출력\n");
        }
        
        Animal obj = new Mammal("사자", 4);
        Animal ob2 = new Mammal("고래", 0);
        Animal ob3 = new Birds("비둘기", 2);
        Animal[] animal = {obj, ob2, ob3};
        for (Animal list2 : animal) {
            list2.move();
        }
    }
}