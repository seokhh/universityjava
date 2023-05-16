package javaprogramming.week11.exam01;

class Friend{
    protected String name, phoneNumber, address;

    /*public Friend(String name, String phoneNumber, String address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    } 생성자 안 쓰고 super로 표현할려함*/
    public void showData(){
        System.out.print(name + ":" + phoneNumber + "," + address);
    }
}
class HighSchoolFriend extends Friend {
    private String job;

    public HighSchoolFriend(String name, String phoneNumber, String address, String job) {
        super.name = name;
        super.phoneNumber = phoneNumber;
        super.address = address; //여기서 super.으로 부모 멤버변수 가져다 씀
        this.job = job;
    }

    public void showData(){
        super.showData();
        System.out.println(" (직업=" + job + ")");
    }
}
class UniversityFriend extends Friend {
    private String major;

    public UniversityFriend(String name, String phoneNumber, String address, String major) {
        super.name = name;
        super.phoneNumber = phoneNumber;
        super.address = address;
        this.major = major;
    }

    public void showData(){
        super.showData();
        System.out.println(" (전공=" + major + ")");
    }
}
public class Exam01 {
    public static void main(String[] args){
        Friend f1 = new Friend();
        Friend h1 = new HighSchoolFriend("홍길동", "010-1111-1212","부천","공무원");
        Friend u1 = new UniversityFriend("김철수", "010-1111-1111","서울","컴공");
        Friend u2 = new UniversityFriend("이영희", "010-2222-1111", "인천", "미콘");

        Friend[] friends = {h1, u1, u2};
        for(Friend list : friends){
            list.showData();
        }
    }
}