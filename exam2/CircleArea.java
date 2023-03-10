package javaprogramming.week2.exam1.no2;

public class CircleArea {
    public static void main(String[] args){
        final double PI = 3.14;

        double radius = 10.0;
        double circleArea1 = radius*radius*PI;
        System.out.println("원1의 면적: " + circleArea1);

        double circleArea2 = radius*radius*Math.PI;
        System.out.println("원2의 면적: " + circleArea2);
    }
}