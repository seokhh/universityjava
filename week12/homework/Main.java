package javaprogramming.week12.homework;

import java.util.Scanner;

abstract class Friend{
    protected String name, phoneNumber, address;

    public Friend(String name, String phoneNumber, String address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    abstract public void showData();
    abstract public void BasicShowData();
}
class HighSchoolFriend extends Friend {
    private String job;

    public HighSchoolFriend(String name, String phoneNumber, String address, String job) {
        super(name, phoneNumber, address);
        this.job = job;
    }

    public void showData(){
        System.out.println("이름: " + name);
        System.out.println("전화: " + phoneNumber);
        System.out.println("주소: " + address);
        System.out.println("직업: " + job);
    }

    @Override
    public void BasicShowData() {
        System.out.println("이름: " + name);
        System.out.println("전화: " + phoneNumber);
    }
}
class UniversityFriend extends Friend {
    private String major;

    public UniversityFriend(String name, String phoneNumber, String address, String major) {
        super(name, phoneNumber, address);
        this.major = major;
    }

    public void showData(){
        System.out.println("이름: " + name);
        System.out.println("전화: " + phoneNumber);
        System.out.println("주소: " + address);
        System.out.println("전공: " + major);
    }

    @Override
    public void BasicShowData() {
        System.out.println("이름: " + name);
        System.out.println("전화: " + phoneNumber);
        System.out.println("전공: " + major);
    }
}

public class Main {
    public static void main(String[] args){
        Friend[] friend = new Friend[1000];
        int friendCount = 0;
        while (true) {
            System.out.println("*** 메뉴 선택 ***");
            System.out.println("1. 고교 친구 저장\n2. 대학 친구 저장\n3. 전체 정보 출력\n4. 기본 정보 출력\n5. 프로그램 종료");
            System.out.print("선택>> ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("이름 : ");
                    String name = sc.next();
                    System.out.print("전화: ");
                    String phone = sc.next();
                    System.out.print("주소: ");
                    String address = sc.next();
                    System.out.print("직업: ");
                    String job = sc.next();
                    friend[friendCount]= new HighSchoolFriend(name,phone,address,job);
                    friendCount++;
                    System.out.print("입력 완료!\n");
                    break;
                case 2:
                    System.out.print("이름 : ");
                    String name1 = sc.next();
                    System.out.print("전화: ");
                    String phone1 = sc.next();
                    System.out.print("주소: ");
                    String address1 = sc.next();
                    System.out.print("전공: ");
                    String major = sc.next();
                    friend[friendCount] = new UniversityFriend(name1, phone1, address1, major);
                    friendCount++;
                    System.out.print("입력 완료!\n");
                    break;
                case 3:
                    for(int i = 0; i<friendCount; i++){
                        friend[i].showData();
                        System.out.println();
                    }
                    break;
                case 4:
                    for(int i =0; i<friendCount; i++){
                        friend[i].BasicShowData();
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("다른 숫자를 입력해주세요.(1~5)");
                    break;
            }
        }
    }
}