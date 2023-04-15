package javaprogramming.week7.exam;
//regNum(계좌번호) name / name(이름), money(예금) private
class Account{
    public String regNum;
    private String name;
    private int money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    //setter getter는 alt+insert를 누르면 나옴 거기서 선택해서 사용
}
public class Exam04 {
    public static void main(String[] args){
        Account account = new Account();
        account.regNum = "351-0215-3286-33";
        //account.name = "석해현";  name은 private라 여기서 조정불가
        //account.money = 100000000; 마찬가지로 같음
        account.setName("석해현");
        account.setMoney(20000000);
        System.out.print(account.getName() + "의 계좌번호: " + account.regNum+ " 예금액: " + account.getMoney());
    }
}