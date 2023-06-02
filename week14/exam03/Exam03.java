package javaprogramming.week14.exam03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args){
        //Arraylist 클래스 이용해서 영어이름을 4개 입력받아 추가하고 출력
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        for(int i = 0 ; i< 4; i++){
            System.out.print("영어이름 입력: ");
            //String name= sc.next();
            //a.add(name);
            a.add(sc.next());
        }
        for(String list: a){
            System.out.print(list+ " ");
        }
        System.out.println("\n=====요소의 문자열의 길이=====");
        for(int i =0; i<a.size(); i++){
            //System.out.print(a.get(i)+" ");
            System.out.print(a.get(i).length()+" "); //길이를 가져오는 '메서드' length()
            //입력받은 문자의 길이가 가장 긴 이름을 검색해주세요
        }
        System.out.println("\n=====가장 긴 문자열=====");
        int max = 0;
        for(int i =1; i<a.size(); i++){
            if(a.get(max).length()<a.get(i).length()){
                max = i;
            }
        }
        System.out.println(a.get(max)); //인덱스를 변수로 취급하고 비교 꼭 기억하기 기말고사에서 나옴
    }
}
