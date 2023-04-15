package javaprogramming.week7.exam;

import java.util.ArrayList;
import java.util.Scanner;

//Person 클래스 : 전화번호 목록 저장
// 필드 이름 전번
//동작 문자열 반환 toString
// 생성자 이름 전번 초기화
//arraylist Person 객체배열을 정의하고 전번 추가하여 출력
class Person{
    String name, number;
    Person(String name, String number){
        this.name = name;
        this.number = number;
    }
    public String toString(){return name+"의 전화번호는 " + number;}
}
public class Exam03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("목록의 수를 입력하세요: ");
        int a = sc.nextInt();
        String name, number;
        ArrayList<Person> arrayList = new ArrayList<>();
        /*arrayList.add(new Person("홍길동","010-1111-1111"));
        arrayList.add(new Person("김춘수","010-2222-2222"));
        arrayList.add(new Person("고길동","010-5123-4865"));*/
        for(int i = 0; i<a; i++){
            System.out.print("이름과 전화번호 입력: ");
            name = sc.next();
            number = sc.next();
            arrayList.add(new Person(name, number)); //arraylist 활용 방법 외우기 제발 꼭
        }
        System.out.println("전화번호 목록");
        for(Person list:arrayList){
            System.out.println(list);
        }
    }
}