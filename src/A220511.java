public class A220511 {

    public static void main(String[]args) {
        int y = 2012;

        if(y % 4 == 0 && y % 100 != 0) {
            System.out.println(1);
        }
        else if(y % 400 == 0) {
            System.out.println(1);
        } else {
        System.out.println(0);
        }
    }
}


//    public static void main(String[]args) {
//    add("김보영", 23);
//    }
//
//    public static void add(String name, int age) {
//        System.out.printf("나는 %s이고, %d살입니다", name, age);
//          }
//    }



//    public static void main(String[]args) {
//        int a = 10, b = 11;
//
//        if (a > b) {
//            System.out.println(">");
//        }
//
//        else if (a < b) {
//            System.out.println("<");
//        }
//
//        else {
//            System.out.println("=");
//        }
//
//    }


//    public static void main(String[]args) {
//        int a = 5;
//
//        System.out.println("카운트 다운을 시작합니다");
//
//        while (a >= 1) {
//            System.out.print(a + " ");
//            a--;
//        }
//        System.out.println();
//        System.out.println("발사!");
//
//    }


//    public static void main(String[]args) {
//        int num=0;
//
//        for(int i=1; i <=20; i++) {
//            num += i;
//
//        }
//        System.out.println(num);
//    }