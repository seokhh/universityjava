package javaprogramming.week6.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args){
        //좋아하는 순서대로 4개의 스포츠를 입력받아 arraylist 클래스를 이용하여 배열에 저장하고
        //for~each문을 이용하여 출력
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0; i<4; i++){
            System.out.print("스포츠 입력: ");
           arrayList.add(sc.next());
        }
        System.out.print("좋아하는 4개의 스포츠는 ");
        for(String list : arrayList){
            System.out.print(list+" ");
        }
        System.out.println("\n 제가 제일 좋아하는 스포츠: " + arrayList.get(0)); //get은 몇번째 요소를 가져올지 정할 수 있다
    }
}