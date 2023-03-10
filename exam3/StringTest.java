package javaprogramming.week2.exam1.no3;

public class StringTest {
    public static void main(String[] args) {
        var s1 = "Hello World!";
        String s2 = new String("I'm a new Java programmer!");
        String s3 = new String("I'm a new Java programmer!");
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));
        System.out.println(s1 + "\n" + s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}