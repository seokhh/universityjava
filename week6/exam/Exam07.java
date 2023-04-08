package javaprogramming.week6.exam;
//Box라는 클래스
//넓이를 구하는 클래스를 정의 필드 가로 세로 깊이, 메소드 : 면적 구해서 출력
//생성자: 모든걸 초기화하는 생성자, 가로와 세로만 초기화하는 생성자 두 개 정의

    class Box{
        int col; //가로
        int row; //세로
        int height; //깊이
    public void print(){
        System.out.println("박스의 면적: "+ (col*row*height));
    }
    public Box(){
        this(1,1,1);
    }
    public Box(int col, int row){
        this();
        this.col = col;
        this.row = row;
    }
    public Box(int col, int row, int height){
        this.col = col;
        this.row = row;
        this.height = height;
    }
}
public class Exam07 {
    public static void main(String[] args){
        Box box1 = new Box(10,10); //높이가 정의되어있지 않아서 0으로 나옴 디폴트가 생성자를 만들기전까진
        Box box2 = new Box(10,10,10);
        box1.print();
        box2.print();
    }
}