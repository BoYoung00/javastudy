public class A220603 {
    public static void main(String[] args) {
        Auser a1 = new Auser("김보영", 100);
        System.out.println(a1.toString());
        Buser b1 = new Buser("김보영",100,150);
        System.out.println(b1.toString());
    }
}
class Auser{
    protected String name; //protected 상속 시에 접근이 가능한 접근 제한자
    protected  int hp;
    public Auser(String name, int hp) {
        this.name=name;
        this.hp=hp;
    }

    @Override
    public String toString() {
        return "Auser{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
class Buser extends Auser { //자식 클래스
    private int mp;

    public Buser(String name, int hp, int mp) {
        super(name,hp);
        this.mp=mp;
    }

    @Override
    public String toString() {
        return "Buser{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mp=" + mp +
                '}';
    }
}