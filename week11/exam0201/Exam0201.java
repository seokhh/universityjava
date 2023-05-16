package javaprogramming.week11.exam0201;
import java.util.Scanner;

class Item{
    int price;
}
class Noodle extends Item {
    public Noodle(){
        super.price = 4000;
    }

    @Override
    public String toString() {
        return "국수";
    }
}
class MixNoodle extends Item {
    public MixNoodle(){
        super.price = 4500;
    }
    public String toString() {
        return "비빔국수";
    }
}
class Woodong extends Item {
    public Woodong(){
        super.price = 5000;
    }
    public String toString() {
        return "우동";
    }
}
class Buyer{
    private static int money;

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        Buyer.money = money;
    }

    public Buyer(int m){
        money = m;
    }
    public void buy (Item it, int count) {
        money = money - (it.price*count);
        if (money >= 0) {
            System.out.println(it + "를 " + count + "개 먹었습니다.");
            System.out.println("남은 돈: " + money);
        }
        else System.out.println(it + "를 살 돈이 없습니다.\n부족한 금액은 " + (it.price + money) + "원 입니다.");
    }
}
//돈이 부족하면 돈이 빠지는데 뭐가 문제인지 알아볼 것 돈이 사라지는 과정도 출력될 수 있게 다시 프로그래밍 할 것 부족한 금액은 +가 아니라 -로 출력하게 할 것
//if문 안쓰고 할 수 있는 방법 고안해보기
public class Exam0201 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("현재 가진 돈을 입력하세요: ");
        Buyer.setMoney(sc.nextInt());
        Buyer b = new Buyer(Buyer.getMoney());
        while (Buyer.getMoney() >= 0) {
            System.out.println("메뉴판 1.국수 2.비빔국수 3.우동 4.현재 남은 돈");
            System.out.print("메뉴판에서 메뉴를 선택하세요: ");
            int a = sc.nextInt();
            if (a == 1) {
                System.out.print("몇개 먹을지 선태하세요: ");
                int count = sc.nextInt();
                b.buy(new Noodle(), count);
            }
            if (a == 2) {
                System.out.print("몇개 먹을지 선태하세요: ");
                int count = sc.nextInt();
                b.buy(new MixNoodle(), count);
            }
            if (a == 3) {
                System.out.print("몇개 먹을지 선태하세요: ");
                int count = sc.nextInt();
                b.buy(new Woodong(), count);
            }
            if (a == 4) {
                System.out.println("현재 남은 돈: " + Buyer.getMoney());
            }
        }
    }
}
