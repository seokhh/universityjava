package javaprogramming.week6.exam;


//Book 클래스 정의 책제목과 저자 속성을 가진 클래스
//어린왕자의 저자는 생텍쥐페리 입니다. 라고 출력하는 메소드 정의
//책 제목과 저라를 초기화하는 생성자와 책 제목만 초기화하는 생성자 정의
class Book{
    String title;
    String author;
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    Book(String title){
        this.title = title;
        author = "작가미상";
    }
    void print(){
        System.out.println("책 제목: " + title+ "\n저자: " + author + "\n");
    }
}
public class Exam05 {
    public static void main(String[] args){
        Book book1 = new Book("어린왕자","생택쥐페리");
        book1.print();
        Book book2 = new Book("춘향전");
        book2.print();
        //Book bool3 = new Book(); 생성자가 하나라도 정의되어있으면 디폴트 생성자 호출불가
        System.out.println(book1); //정의하지 않으면 기본값으로 나오게 되어있음 기본 값은 클래스의 객체 이름을 호출
    }
}