package javaprogramming.week4;

public class project1 {
    public static void main(String[] args){
        int i = 1, onetoten = 0, even=0, odd=0;

        while(i <= 100){
            if(i<=10){
                onetoten += i;
            }
            if (i %2 ==0) {
                even += i;
            }
            else {
                odd += i;
            }
            i++;
        }
        System.out.println("1~10까지 합 = " + onetoten);
        System.out.println("짝수합 = " + even);
        System.out.println("홀수합 = " + odd);
    }
}
