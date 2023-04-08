package javaprogramming.week6.exam;
class Math{
    public int square(int i){
        return i*i;
    }
    public double square(double i){
        return i*i;
    }
    public int square(int i, int j) {
        return  i*j;
    }
    public double square(double i , double j){
        return i*j;
    }
}
public class Exam03 {
    public static void main(String[] args){
        Math math = new Math();
        System.out.println(math.square(5));
        System.out.println(math.square(2.0));
        System.out.println(math.square(5,4));
        System.out.println(math.square(5.5,1.2));
    }
}
