package javaprogramming.week13.exam04;

public class Exam04 {
    public static void main(String[] args){
        String a = new String(" c#");
        String b = new String(",c++");
        a=a.concat(b); //a방은 바뀌지 않음 a= a.concat을 헤야 바뀜
        System.out.println(a);
        a=a.trim(); // 공백을 없애줌
        System.out.println(a);
        a=a.replace("c#", "java");
        System.out.println(a);
        String[] s = a.split(","); //분리시켜줌
        for(int i =0; i< s.length; i++){
            System.out.println("S[" + i + "]=" + s[i]);
        }
        a=a.substring(5); //글자 몇번째부터 시작할지 정의
        System.out.println(a);
        a=a.toUpperCase();
        System.out.println(a);
    }
}
