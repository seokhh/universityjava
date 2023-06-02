package javaprogramming.week14.exam04;

import java.util.HashMap;
import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args){
        //hashamap 클래스로 영문자를 한글로 번역하는 프로그램 작성
        HashMap<String, String> h = new HashMap<String, String>(); // <> 안에 값이 같은 경우는 뒤에를 생략해도 되지만 둘이 다르면 뒤에 <>안에 써줘야됨 그냥 써주는게 좋다.
        //get은 키 값을 가져온다. for-each로 전체를 가져오지 못함 추가할 떄 put 사용
        h.put("baby", "아기");
        h.put("peach", "복숭아");
        h.put("student", "학생");
        h.put("university", "대학교");
        // 찾고싶은 영어단어를 입력 받아 한국어로 출력
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("영어단어 입력: ");
            String word = sc.next();
            if(word.equals("exit")) {
                System.out.println("검색을 종료합니다.");
                break;
            }
            String kor = h.get(word);
            if(kor==null){
                System.out.println("찾는 단어가 없습니다.");
            }
            else
                System.out.println(h.get(word));
        }
    }
}