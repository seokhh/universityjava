package javaprogramming.week7.exam;

class Kbank{
    private String name;
    private double money;
    private static double rate;
    public Kbank(String name, double money, double r){
        this.name = name;
        this.money = money;
        rate = r;
    }

    @Override
    public String toString() {
        return name +", 입금액: " + money + ", 이율: " + rate;
    }
}
public class Exam07 {
    public static void main(String[] args){
        Kbank k1 = new Kbank("홍길동", 2000, 0.2);
        System.out.println(k1);
        System.out.println("--------------------------");
        Kbank k2 = new Kbank("김주한", 2000, 0.4);
        System.out.println(k1);
        System.out.println(k2);
        System.out.println("---------------------------");
        Kbank k3 = new Kbank("권혁", 2000, 0.8);
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
    }
}