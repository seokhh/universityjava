package javaprogramming.week14.exam05;

import java.util.HashMap;
import java.util.Scanner;

//Student 클래스 정의: id, tel 멤버변수 접근제한 생성자초기화 getter함수
class Student{
    private int id;
    private String tel;
    public Student(int id, String tel){
        this.id = id;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public String getTel() {
        return tel;
    }
}
public class Exam05 {
    public static void main(String[] args){
        HashMap<String, Student> h = new HashMap<String, Student>();
        h.put("홍길동", new Student(1,"010-1111-1111"));
        h.put("김춘수", new Student(2,"010-2222-2222"));
        h.put("이양촌", new Student(3,"010-3333-3333"));
        // exit를 입력받으면 종료 이름을 입력받아 그 학생의 id와 tel 출력
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("이름을 입력하세요: ");
            String name = sc.next();
            if(name.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            Student a = h.get(name);
            if(a==null)
                System.out.println("찾는 이름이 없습니다.");
            else
                System.out.println("ID: "+a.getId()+", Tel: "+a.getTel()); //private로 제한했기때문에 getid, gettel로 가져와야함
        }
    }
}