package javaprogramming.week7.exam;

class Pizza{
    private String topping;

    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Pizza.count = count;
    }
    private static int count = 0;
    public Pizza(String topping){
        this.topping = topping;
        count++;
    }
    public String toString(){
        return topping+"피자";
    }
}
public class Exam06 {
    public static void main(String[] args){
        Pizza pizza1 = new Pizza("슈프림");
        Pizza pizza2 = new Pizza("고구마");
        Pizza pizza3 = new Pizza("페퍼로니");
        Pizza pizza4 = new Pizza("불고기");
        System.out.println("팔린 피자의 개수: "+Pizza.getCount()); //static은 클래스.멤버변수로 접근 가능
    }
}
