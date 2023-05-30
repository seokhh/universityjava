package javaprogramming.week13.exam01;
// PhoneInterface : 상수값, 디폴트 메서드, sendCall() receiveCall()
// SmartInterface : PhoneInterface 상속 sendSns(), receiveSns()
// Mp3 : play() stop()
// 클래스 Pda : Calculator() 정의
// SmartPhone : 인터페이스와 클래스를 다중 상속 구현
interface PhoneInterface{
    final int TIMEOUT = 100000;
    public void sendCall();
    public void receiveCall();
    default public void printLog(){
        System.out.println("*****Phone***************");
    }
}
interface SmartInterface extends PhoneInterface{
    public void sendSns();
    public void receiveSns();
}
interface Mp3 {
    public void play();
    public void stop();
}
class Pda{
    public int Calculator(int x, int y){
        return x+y;
    }
}
class SmartPhone extends Pda implements SmartInterface, Mp3{

    @Override
    public void sendCall() {
        System.out.println("전화를 겁니다.");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화를 받습니다.");
    }

    @Override
    public void sendSns() {
        System.out.println("문자를 보냅니다.");
    }

    @Override
    public void receiveSns() {
        System.out.println("문자를 받습니다.");
    }
    public void schedule(){
        System.out.println("스케쥴을 짭니다.");
    }
    @Override
    public void play() {
        System.out.println("음악을 재생합니다.");
    }

    @Override
    public void stop() {
        System.out.println("음악을 멈춥니다.");
    }
}
public class Exam01 {
        public static void main(String[] args){
            SmartPhone obj = new SmartPhone();
            obj.printLog();
            obj.sendCall();
            obj.receiveSns();
            obj.schedule();
            obj.play();
            System.out.println(obj.Calculator(10,45));
        }
}