import java.util.Scanner;

public class A220525 {
    public static void main(String[] args) {
        Player a1 = new Player("피카츄", 30);
        Player a2 = new Player("잉어킹", 40);
        a1.skill(a2);
    }
}

class  Player{
    String name;
    int hp;

    Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    void skill(Player s){
        s.hp-=10;
        System.out.printf("[%s]의 스킬\n",name);
        System.out.printf("[%s]의 HP : %d",name,s.hp);
    }
}

//        Bank b1=new Bank(100000);
//        user.a(b1,100000);
//
//    }
//}
//
//class Bank {
//    private int money;
//
//    Bank(int money) {
//        this.money = money;
//    }
//
//    public int getMoney() {
//        return money;
//    }
//
//    public void setMoney(int money) {
//        this.money = money;
//    }
//}
//
//class user {
//    public static void check(Bank bank) {
//        System.out.printf("현재 잔액은 : %d \n", bank.getMoney());
//    }
//    public  static void a(Bank bank, int b){
//        int c = bank.getMoney();
//        bank.setMoney(c+b);
//    }
//}




// Boolean a = in.hasNextInt(); //숫자면 True 문자면 False



//    Scanner in = new Scanner(System.in);
//
//    int a = in.nextInt();
//    int b = in.nextInt();
//
//    int c = a/b;
//    int d = a%b;
//
//        System.out.printf("%d, %d의 몫 : %d, 나머지 : %d", a,b,c,d);



//        Test.m1();
//    }
//}
//
//class Test{
//    static void m1() { //public(모든 사람에게 공개) default(패키지 안에서만 사용) protected(상속할 경우에만 공개) private(완전 비공개)
//        System.out.println("나는 유틸리티 메소드예요");
//    }
//    void m2() {
//        System.out.println("그냥 메소드예요");
//    }
//}


//    Person p1=new Person("김보영", "010-2449-6358");
//        System.out.printf("이름 : %s, 번호 : %s", p1.getName(),p1.getNumber());
//
//                p1.setName("ddd");
//                p1.setNumber("010-2449-6355");
//                System.out.printf("이름 : %s, 번호 : %s", p1.getName(),p1.getNumber());
//                }
//                }
//class Person{
//    private String name;
//    private String number;
//
//    public Person(String name, String number) {
//        this.name =name;
//        this.number = number;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getNumber() {
//        return number;
//    }
//
//    public void setNumber(String number) {
//        this.number = number;
//    }
//}