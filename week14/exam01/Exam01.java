package javaprogramming.week14.exam01;

import java.util.Vector;

//vector 컬렉션을 이용하여 정수형 5개 추가 출력 for문 사용하여 추가된 값을 더한 후 출력
public class Exam01 {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(100);
        v.add(1000);
        v.add(10000);
        v.add(100000);

        for(Integer list:v)
            System.out.print(list+ " ");
        //v.add(1, 200);
        v.remove(1);
        System.out.println("\n===========================");
        for(Integer list:v)
            System.out.print(list+ " ");
        System.out.println("\n==========요소의 개수=========\n"+v.size());
        System.out.println("===========요소의 용량=========\n"+v.capacity());
        //요소의 값들의 합을 출력 for문 사용해서
        int sum = 0;
        for(int i =0; i<v.size(); i++){ //length없고 size를 써야됨 시험 문제에 괄호 꼭 써야됨
            sum += v.get(i);
        }
        System.out.println("요소의 합: "+sum);
    }
}