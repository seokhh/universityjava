package javaprogramming2;

public class Main {
    public static void main(String[] args){
        String c1 = "red";
        String c2 = "r";
        c2 += "ed";
        System.out.println(c2);
        if (c1 == c2) System.out.println("1과 3은 같은 스트링");
        if (c1 != c2) System.out.println("다른 스트링");
        if (c1.equals(c2)) System.out.println("색이 같다");

        String str1 = "Sweet";
        String str2 = str1;
        str2.replace('e', 'i');
        String str3 = str1;
        str3 += "Song";
        System.out.println(str1 + " " + str2 +  " "+ str3);
        String str4 = str2;
        System.out.println(str1 + " " + str4 +  " "+ str3);

    }
}
