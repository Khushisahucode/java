class xe {
    void sqr(int x){
        System.out.print("square is :");
        System.out.println(x*x);
    }
}
 public class O extends xe{
    void sqr(float x){
        System.out.print("addition  is :");
        System.out.println(x+x);
    }
    public static void main(String[] args) {
        O z=new O();
        z.sqr(4);
        z.sqr(3.4f);

    }
//method overloading should contains same outcome
}
