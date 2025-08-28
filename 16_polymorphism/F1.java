public class F1 {
    public static void main(String[]args)
    {
       bbb x=new ccc();
       x.walk();
       x.talk();
       x.laugh();
      System.out.println( x.toString());
    }


}
/*
 * F1.java:7: error: cannot find symbol
       x.laugh();
        ^
  symbol:   method laugh()
  location: variable x of type bbb
1 error
 */
