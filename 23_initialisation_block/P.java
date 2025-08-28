public class P {
    int x=90;
    {
        System.out.println("hello");
      pro();
    }
     void pro(){
       System.out.println(x);
       System.out.println("hii....");
    }

    //int x=99;
    P(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        P x=new P();
    }
}
/*
 * hello
90
hii....
constructor
 */
