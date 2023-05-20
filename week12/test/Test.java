package javaprogramming.week12.test;

abstract class Drink{
    protected String name;
    protected Drink(String name){
        this.name = name;
    }
    abstract public void ordering();
}
class Beer extends Drink{
    private int price;
    public Beer(String name, int price) {
        super(name);
        this.price = price;
    }
    @Override
    public void ordering() {
        System.out.println(name + "의 가격: " + price);
    }
}
class Coffee extends Drink{
    private int price;
    protected Coffee(String name, int price) {
        super(name);
        this.price = price;
    }
    @Override
    public void ordering() {
        System.out.println(name + "의 가격: " + price);
    }
}
public class Test {
    public static void main(String[] args){
        System.out.println("===주문내역============");
        Drink[] d = new Drink[100];
        d[0] = new Beer("카스", 5000);
        d[1] = new Coffee("카페라테", 3000);
        d[2] = new Coffee("아메리카노", 2500);
        d[3] = new Beer("버드와이저", 7000);

        try {
            for(Drink list : d){
                list.ordering();
            }
        }
        catch (NullPointerException e){
        }
    }
}