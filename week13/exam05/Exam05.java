package javaprogramming.week13.exam05;

public class Exam05 {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("this");
        sb.append(" is pencil"); //여긴 sb방을 다시 초기화할 필요가 없다
        System.out.println(sb);
        sb.insert(7, " my");
        System.out.println(sb);
        sb.replace(8,10,"your");
        System.out.println(sb);
    }
}
