package javaprogramming.week2.project2;
import java.util.Scanner;
public class SumAndAvg2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("과목의 총 개수를 입력해주세요: ");
        int subject = sc.nextInt();

        switch (subject){
            case 1:
                System.out.print("시험 본 과목을 적어주세요: ");
                String sub1 = sc.next();
                System.out.print(sub1 + "점수를 입력해주세요: ");
                int score1 = sc.nextInt();
                System.out.println("과목이 한 개라 평균과 총 합이 필요없습니다.");
                break;

            case 2:
                System.out.print("시험 본 과목을 적어주세요: ");
                String[] arr1 = new String[subject];
                for(int i = 0;i<subject; i++){
                arr1[i] = sc.next();
                }
                int[] arr1_1 = new int[subject];
                int sum2 = 0;
                for(int i = 0; i< arr1.length; i++){
                    System.out.print(arr1[i] +"점수를 입력해주세요: ");
                    arr1_1[i] = sc.nextInt();
                    sum2 += arr1_1[i];
                }
                for(int j =0; j<arr1.length; j++){
                    if(j == 1){
                        System.out.print(arr1[j] + " ");
                    } else {System.out.print(arr1[j] + ", ");}
                }
                System.out.println(subject +"과목의 점수의 총 합은 " +sum2 + "점 입니다.");
                double avg2 = (double) (sum2) / subject;
                for(int k =0; k< arr1.length; k++){
                    if(k == 1){
                        System.out.print(arr1[k] + " ");
                    } else {System.out.print(arr1[k] + ", ");}
                }
                System.out.println(subject + "과목의 평균은 " + avg2 + "점 입니다.");
                break;

            case 3:
                System.out.print("시험 본 과목을 적어주세요: ");
                String[] arr2 = new String[subject];
                for(int i = 0;i<subject; i++){
                    arr2[i] = sc.next();
                }
                int[] arr2_1 = new int[subject];
                int sum3 = 0;
                for(int i = 0; i< arr2.length; i++){
                    System.out.print(arr2[i] +"점수를 입력해주세요: ");
                    arr2_1[i] = sc.nextInt();
                    sum3 += arr2_1[i];
                }
                for(int j =0; j<arr2.length; j++){
                    if(j == 2){
                        System.out.print(arr2[j] + " ");
                    } else {System.out.print(arr2[j] + ", ");}
                }
                System.out.println(subject +"과목의 점수의 총 합은 " +sum3 + "점 입니다.");
                double avg3 = (double) (sum3) / subject;
                for(int k =0; k< arr2.length; k++){
                    if(k == 2){
                        System.out.print(arr2[k] + " ");
                    } else {System.out.print(arr2[k] + ", ");}
                }
                System.out.println(subject + "과목의 평균은 " + avg3 + "점 입니다.");
                break;

            case 4:
                System.out.print("시험 본 과목을 적어주세요: ");
                String[] arr3 = new String[subject];
                for(int i = 0;i<subject; i++){
                    arr3[i] = sc.next();
                }
                int[] arr3_1 = new int[subject];
                int sum4 = 0;
                for(int i = 0; i< arr3.length; i++){
                    System.out.print(arr3[i] +"점수를 입력해주세요: ");
                    arr3_1[i] = sc.nextInt();
                    sum4 += arr3_1[i];
                }
                for(int j =0; j<arr3.length; j++){
                    if(j == 3){
                        System.out.print(arr3[j] + " ");
                    } else {System.out.print(arr3[j] + ", ");}
                }
                System.out.println(subject +"과목의 점수의 총 합은 " +sum4 + "점 입니다.");
                double avg4 = (double) (sum4) / subject;
                for(int k =0; k< arr3.length; k++){
                    if(k == 3){
                        System.out.print(arr3[k] + " ");
                    } else {System.out.print(arr3[k] + ", ");}
                }
                System.out.println(subject + "과목의 평균은 " + avg4 + "점 입니다.");
                break;

            case 5:
                System.out.print("시험 본 과목을 적어주세요: ");
                String[] arr4 = new String[subject];
                for(int i = 0;i<subject; i++){
                    arr4[i] = sc.next();
                }
                int[] arr4_1 = new int[subject];
                int sum5 = 0;
                for(int i = 0; i< arr4.length; i++) {
                    System.out.print(arr4[i] + "점수를 입력해주세요: ");
                    arr4_1[i] = sc.nextInt();
                    sum5 += arr4_1[i];
                }
                for(int j =0; j<arr4.length; j++){
                    if(j == 4){
                        System.out.print(arr4[j] + " ");
                    } else {System.out.print(arr4[j] + ", ");}
                }
                System.out.println(subject +"과목의 점수의 총 합은 " +sum5 + "점 입니다.");
                double avg5 = (double) (sum5) / subject;
                for(int k =0; k< arr4.length; k++){
                    if(k == 4){
                        System.out.print(arr4[k] + " ");
                    } else {System.out.print(arr4[k] + ", ");}
                }
                System.out.println(subject + "과목의 평균은 " + avg5 + "점 입니다.");
                break;
        }
        System.out.println("시험 보느라 수고하셨습니다.");
    }
}