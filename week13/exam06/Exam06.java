package javaprogramming.week13.exam06;

import java.sql.Timestamp;
import java.util.Calendar;

public class Exam06 {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.get(Calendar.YEAR) + "년");
        System.out.println(c.get(Calendar.MONTH)+1+"월"); //달은 원래 달보다 1달 적게 나와서 1을 더해야함
        System.out.println(c.get(Calendar.DATE)+"일");
        Timestamp now = new Timestamp(System.currentTimeMillis());  //security 패키지도 있는데 sql을 써야됨
        System.out.println(now);
    }
}
