package javaprogramming.week9.homework;

class Friend{
    private String name, phoneNumber, address;

    public Friend(String name, String phoneNumber, String address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public void showData(){
        System.out.print(name + ":" + phoneNumber + "," + address);
    }
}
class HighSchoolFriend extends Friend{
    private String job;

    public HighSchoolFriend(String name, String phoneNumber, String address, String job) {
        super(name, phoneNumber, address);
        this.job = job;
    }

    public void showData(){
        super.showData();
        System.out.println(" (직업=" + job + ")");
    }
}
class UniversityFriend extends Friend{
    private String major;

    public UniversityFriend(String name, String phoneNumber, String address, String major) {
        super(name, phoneNumber, address);
        this.major = major;
    }

    public void showData(){
        super.showData();
        System.out.println(" (전공=" + major + ")");
    }
}
public class Main {
    public static void main(String[] args){
        HighSchoolFriend h1 = new HighSchoolFriend("홍길동", "010-1111-1212","부천","공무원");
        UniversityFriend u1 = new UniversityFriend("김철수", "010-1111-1111","서울","컴공");
        UniversityFriend u2 = new UniversityFriend("이영희", "010-2222-1111", "인천", "미콘");

        Friend[] friends = {h1, u1, u2};
        for(Friend list : friends){
            list.showData();
        }
    }
}