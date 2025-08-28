public class T {
    public static void main(String[] args) {
        dog s=new dog();
        cat v=new cat();
        pro(s);
        info(v);
    }
   static  void pro(dog d){
        System.out.println(d);
    }
    static void info(cat c){
        System.out.println(c);
    }
}
