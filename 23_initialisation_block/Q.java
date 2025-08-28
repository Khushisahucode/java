public class Q {
    void pro(){
        System.out.println("hii");
        System.out.println(x);
    }
    Q(){
  System.out.println(x);
    }
    {
        System.out.println(x);
    }

    int x=89;
    public static void main(String[] args) {
        Q x=new Q();
        x.pro();
    }
}
/*
 * Q.java:10: error: illegal forward reference
        System.out.println(x);
                           ^
1 error
 * 
 * 
 */