package javaprogramming.week7.project;
class Plane{
    private String company, model;
    private int maxPassenger;

    public static int getPlanes() {
        return planes;
    }

    public static void setPlanes(int planes) {
        Plane.planes = planes;
    }

    private static int planes = 0;
    Plane(){
        company = "Asiana";
        model = "Boeing 737";
        maxPassenger = 800;
        planes++;
    }
    Plane(String company, String model, int maxPassenger){
        this.company = company;
        this.model = model;
        this.maxPassenger = maxPassenger;
        planes++;
    }

    @Override
    public String toString() {
        return "비행기 모델 : " + model + ", 승객수 : "+ maxPassenger + "명, 제조사 : " + company;
    }
}
public class Project {
    public static void main(String[] args){
        Plane plane1 = new Plane();
        Plane plane2 = new Plane("korea", "Boeing 800", 900);
        Plane plane3 = new Plane("airbus", "A380", 500);
        System.out.println("비행기 개수 : " + Plane.getPlanes());
        System.out.println(plane1);
        System.out.println(plane2);
        System.out.println(plane3);
    }
}
