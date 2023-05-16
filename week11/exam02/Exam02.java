package javaprogramming.week11.exam02;

import java.util.Scanner;

class Item{
    int price;
}
class Noodle extends Item{
    public Noodle(){
        super.price = 4000;
    }

    @Override
    public String toString() {
        return "국수";
    }
}
class MixNoodle extends Item{
    public MixNoodle(){
        super.price = 4500;
    }
    public String toString() {
        return "비빔국수";
    }
}
class Woodong extends Item{
    public Woodong(){
        super.price = 5000;
    }
    public String toString() {
        return "우동";
    }
}
class Buyer{
    private static int money;
    public Buyer(int m){
        money = m;
    }
    public void buy (Item it, int count) {
        money = money - (it.price*count);
        if (money >= 0) {
            System.out.println(it + "를 " + count + "개 먹었습니다.");
            System.out.println("남은 돈: " + money);
        }
        else System.out.println(it + "를 살 돈이 없습니다.");
    }
}
public class Exam02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Buyer b = new Buyer(20000);
        b.buy(new Noodle(),2);
        b.buy(new MixNoodle(), 3);
        b.buy(new Woodong(), 2);
        }
    }