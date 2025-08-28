public class E1 {
    int x;
    void pro(){

    }
    class T{

    }
    public static void main(String[] args) {
        E1 e=new E1();
        T t=new T();
        System.out.println(x);
        pro();
    }
}
// E1.java:11: error: non-static variable this cannot be referenced from a static context
//         T t=new T();
//             ^
// E1.java:12: error: non-static variable x cannot be referenced from a static context
//         System.out.println(x);
//                            ^
// E1.java:13: error: non-static method pro() cannot be referenced from a static context
//         pro();
//         ^
// 3 errors