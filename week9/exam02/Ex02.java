package javaprogramming.week9.exam02;
//부모클래스 Man 멤버변수 name(이름), dept(학과) 메서드 출력메서드 show()
//자식 클래스 student 멤버변수 grade(학년), 메서드 show() 학년을 추가하여 출력
//Professor 멤버변수 position(직위) 메서드 show() 작위를 추가하여 출력
class Man{
    protected String name, dept;
    public void print(){
        System.out.print("이름: "+ name + ", 학과: " + dept);
    }
}
class Student extends Man{
    private int grade;
    public Student(String name, String dept, int grade){
        super.name = name;
        super.dept = dept;
        this.grade = grade;
    }
    public void print(){
        super.print();
        System.out.println(", 학년: " + grade);
    }
    //4. 상속받은 자식클래스가 부모클래스의 메소드 재정의( 메서드 오버라이딩)
}
class Professor extends Man{
    private String position;
    public Professor(String name, String dept, String position){
        super.name= name;
        super.dept = dept;
        this.position = position;
    }
    public void print(){
        super.print();
        System.out.println(", 직위: " + position);
    }
}
public class Ex02 {
    public static void main(String[] args){
        Man m = new Man();
//5. 부모 클래스인 Man 으로 호출해도 문제 없다. 상속받은 자식클래스의 부모클래스로부터 객체를 인스턴스화해도 됩니다.
        Man s1 = new Student("석해현", "컴퓨터공학부", 2);
        Student s2 = new Student("123", "123", 3);

        Professor p1 = new Professor("aaa", "bbb" , "조교수");
        Professor p2 = new Professor("ccc", "ddd" , "부교수");
        Man[] list =  {s1, s2, p1, p2};
        for(Man  a : list){
            a.print();
        }

    }
}