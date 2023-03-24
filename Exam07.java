package javaprogramming.week4.exam;

public class Exam07 {
    public static void main(String[] args){
        //4단 6단 제외하고 출력 (단 단보다 곱해지는 값이 커지면 다음 단으로)
        //break 와 continue 활용
        for(int i = 2; i<=9; i++){
            if(i == 4 || i == 6) continue;
            {
                for (int k = 1; k <= 9; k++) {
                    if (k > i)
                        break;
                    {
                        System.out.println(i + " * " + k + " = " + (i * k));
                    }
                }
                System.out.println();
            }
        }
    }
}
