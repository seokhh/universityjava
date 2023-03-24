package javaprogramming.week4;

public class Exam07 {
    public static void main(String[] args){
        /*
        for(int i =1; i<=10; i++){
            if(i==5) continue;{//break는 4까지만 continue는 5빼고 출력 다시 반복문으로 돌아간다
                System.out.print(i + " ");
            }
        }*/
        int i =0;
        while (i<10){
            i++;
            if(i==5)continue;{
            System.out.print(i+ " ");
            }
        }
    }
}
