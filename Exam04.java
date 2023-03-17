package javaprogramming.week3;

public class Exam04 {
    public static void main(String[] args){
        int a = 10;
        int b1 =(a++)+1;
        int b2 = ++b1;
        System.out.println(a++);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println();

        int a1=10, b3= 15;
        System.out.println(Integer.toBinaryString(a1));
        System.out.println(Integer.toBinaryString(b3));
        System.out.println(Integer.toBinaryString(a1&b3) + "," + (a1&b3));
        System.out.println(Integer.toBinaryString(a1|b3) + "," + (a1|b3));
        System.out.println(Integer.toBinaryString(a1^b3) + "," + (a1^b3));
        System.out.println(Integer.toBinaryString(~a1) + "," + (~a1));
    }
}
