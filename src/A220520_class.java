public class A220520_class {

    public static void main(String[] args) {
        Character a1 = new Character("피카츄",95,100,"백만볼트");
        Character a2 = new Character("잉어킹",150,300,"튀어오르기");

        System.out.println(a1.print());
        System.out.println(a2.print());
    }
}

//클래스
class Character {
    String name;
    int hp;
    int mp;
    String skill;

    //생성자
    Character(String _name, int _hp, int _mp, String _skill){
        name=_name;
        hp=_hp;
        mp=_mp;
        skill=_skill;
    }

    //메소드
    String print() {
        return String.format("%s(HP : %d, MP : %d)의 스킬! %s!",name,hp,mp,skill);
    }
}


//    Bread a1 = new Bread("피자빵",1500);
//    Bread a2 = new Bread("야채빵",1000);
//
//        System.out.println(a1.print());
//                System.out.println(a2.print());
//                }
//                }
//
//class Bread {
//    String name;
//    int price;
//
//    //생성자
//    Bread(String _name, int _price){
//        name=_name;
//        price=_price;
//    }
//
//    String print() {
//        return String.format("%s의 가격은 %d원입니다",name,price) ;
//    }
//}