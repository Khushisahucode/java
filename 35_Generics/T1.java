public class T1 {
    public static void main(String[] args) {
        dog s=new dog();
        cat v=new cat();
        show(s);
        show(v);
        // pro(s);
        // info(v);

    }
//    static  void pro(dog d){
//         System.out.println(d);
//     }
//     static void info(cat c){
//         System.out.println(c);
//     }
    static<T> void show(T t){
        System.out.println(t);
    }
}
