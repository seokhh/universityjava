package javaprogramming.week7.exam;

import java.util.Scanner;

//Movie 클래스 정의 필드 title, director
// 생성자 모든 값을 초기화하는 생성자 정의
//메서드 영화제목 감독은 디렉터 식으로 toString()
//Movie 클래스로 3개의 영화를 입력받아 초기화하고 객체 선언하고 출력
class Movie{
    String title, director;
    Movie(String title, String director){
        this.title = title;
        this.director = director;
    }
    public String toString(){return title + "의 감독은 " + director;} //이것좀 외워야됨
}
public class Exam02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Movie[] movie = new Movie[3];
        for(int i =0; i< movie.length; i++){
            System.out.print("영화 이름을 입력하세요: ");
            String title = sc.next();
            System.out.print("감독을 입력하세요: ");
            String director = sc.next();
            movie[i] = new Movie(title, director);
        }
        for(Movie list: movie){
            System.out.println(list/*.toString()*/); //toString 생략 가능
        }
    }
}