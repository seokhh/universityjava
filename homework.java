package javaprogramming2.week1;
import java.util.Scanner;

class People {
    public String name;
    public String idNumber;

    public People(String name, String idNumber){
        this.name = name;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", " + "주민등록번호: " + idNumber + ", ";
    }
}
class Student extends People {
    public int studentNo;

    public Student(String name, String idNumber, int studentNo){
        super(name, idNumber);
        this.studentNo = studentNo;
    }

    @Override
    public String toString() {
        return super.toString() + "번호: " + studentNo;
    }
}
public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수를 입력해주세요: ");
        int num = sc.nextInt();

        People[] student = new People[num];
        System.out.println("학생의 정보를 입력해주세요.");
        for (int i = 0; i < student.length; i++) {
            System.out.print("이름 입력: ");
            String name = sc.next();
            System.out.print("주민번호 입력: ");
            String ssn = sc.next();
            System.out.print("번호 입력: ");
            int studentNo = sc.nextInt();
            System.out.println();
            student[i] = new Student(name, ssn, studentNo);
        }
        for (People list : student) {
            System.out.println(list);
        }
    }
}