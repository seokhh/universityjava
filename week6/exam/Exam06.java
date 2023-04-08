package javaprogramming.week6.exam;
//Pizza 클래스 속성 :type 종류 size 크기 
// toString(): java.object.String => 문자열 반환하는 메소드
// 생성자 : 디폴트 생성자(매개변수가 없는 생성자 정의
// 종류와 크기를 정하는 생성자
class Pizza{
    String type;
    double size;
    String side;
    public String toString(){
        return "피자종료: "+ type + ", 사이즈: " + size+"in" +" (" + side+ ")";
    }
    public Pizza(String type, double size){
        this(); //디폴트 생성자에서 정의한 것을 불러옴
        this.type = type;
        this.size = size;
    }
    public Pizza(){
        this("콤비네이션",12,"추가메뉴 없음");
    } //디폴트 생성자라고 한다.
    public Pizza(String type, double size, String side){
        this.type = type;
        this.size = size;
        this.side = side;
    }
    public Pizza(String type, String side){
        this();
        this.type = type;
        this.side = side;
    }
}
public class Exam06 {
    public static void main(String[] args){
        Pizza pizza1 = new Pizza("고구마피자", 10);
        System.out.println(pizza1.toString());

        Pizza pizza2 = new Pizza();
        System.out.println(pizza2); //toString()을 사용하지 않아도 알아서 사용이 됨 toString()은 매우 빠름

        Pizza pizza3 = new Pizza("베이컨피자",15,"오븐스파게티");
        System.out.println(pizza3);

        Pizza pizza4 = new Pizza("불고기피자","제로콜라");
        System.out.println(pizza4);
    }
}