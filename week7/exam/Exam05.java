package javaprogramming.week7.exam;
//텔레비전 클래스 두개 프라이빗
//생성자 디폴트 1개랑 다 초기화하는 생성자
//set get정의
//toString으로 출력
//출력
class Television{
    private int channel, volume;
    public Television(int channel, int volume){
        this.channel = channel;
        this.volume = volume;
    }
    public Television()
    {
        this(273, 13);
    }
    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public String toString(){
        return "텔레비전 채녈: " + channel + ", 볼륨: " + volume;
    }
}
public class Exam05 {
    public static void main(String[] args){
        Television television1 = new Television();
        Television television2 = new Television(39,20);
        System.out.println(television1);
        System.out.println(television2);
        television2.setChannel(20);
        television2.setVolume(5);
        System.out.print(television2);
    }
}
