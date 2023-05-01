package javaprogramming.week9.exam03;
// 부모클래스 hero  멤버변수 이름 : move() 메서드 정의 접근제한하고 생성자 정의
// 자식 클래스:Superman Batman  멤버변수 : 무기(evel)
class Hero{
    private String name;
    public Hero(String name){
        this.name=name;
    }
    public void move(){
        System.out.print(name);
    }
}
class Superman extends Hero{
    private String level;
    public Superman(String name, String level){
        super(name);
        this.level=level;
    }
    public void move(){
        super.move();
        System.out.println(" " +level+"로 이동");
    }

}
class Batman extends Hero{
    private String level;

    public Batman(String name, String level) {
        super(name);
        this.level=level;
    }
    public void move(){
        super.move();
        System.out.println(" "+level + " 로 이동");
    }
}
public class Ex03{
    public static void main(String[] args){
        Hero h2 = new Superman("슈퍼맨", "망토");
        Hero h3 = new Batman("베트맨","오토바이");
        Hero[] h = {h2, h3};
        for(Hero list : h){
            list.move();
        }
    }
}