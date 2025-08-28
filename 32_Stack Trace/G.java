public class G {

    {
        System.out.println("C");
        int y=12/0;
    }
    G(){
        System.out.println("B");
    }
   
    public static void main(String[] args) {
       System.out.println("A");
        G x=new G();
        System.out.println("D");
    }
}
// A
// C
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at G.<init>(G.java:5)
//         at G.main(G.java:13)