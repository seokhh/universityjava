package javaprogramming.week12.exam01;
interface Calculator{
    int add(int a, int b);
    int subtract(int a, int b);
    double avg(int[] a);
}
public class Exam01 implements Calculator{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    @Override
    public double avg(int[] a) {
        int sum = 0;
        for(int i =0; i<a.length; i++){
            sum += a[i];
        }
        return (double)sum / a.length;
    }

    public static void main(String[] args){
        Exam01 obj = new Exam01();
        System.out.println(obj.add(5,5));
        System.out.println(obj.subtract(8,9));
        System.out.println(obj.avg(new int[] {10,20,30,40}));
        //{10,20,30,40} 이렇게 쓰면 오류가 남 생성을 해줘서 보내야함
    }
}