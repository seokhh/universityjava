package javaprogramming.week9.Project;

import java.util.Scanner;

// 부모클래스 hero  멤버변수 이름 : move() 메서드 정의 접근제한하고 생성자 정의
// 자식 클래스:Superman Batman  멤버변수 : 무기(evel)
class Hero1{
    private String name;
    public Hero1(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'';
    }
}
class Heroman extends Hero1 {
    private String level;
    public Heroman(String name, String level){
        super(name);
        this.level=level;
    }

    @Override
    public String toString() {
        return super.toString() +" " +level + "로 출동";
    }
}
public class Project{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Hero1[] h = new Hero1[3];
        System.out.println("3명의 영웅을 출동시켜주세요.");
        for(int i =0; i< h.length; i++){
            System.out.print("영웅 입력: ");
            String name = sc.next(); //잠시동안 String에 넣어놓기
            System.out.print("무기 입력: ");
            String level = sc.next(); //잠시동안 String에 넣어놓기
            h[i] = new Heroman(name, level);
        }
        for(Hero1 list : h){
            System.out.println(list);
        }
    }
}