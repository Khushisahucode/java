public class F2 {
    public static void main(String[]args)
    {
       aaa x=new ccc();
       x.walk();
       x.talk();
       x.laugh();
      System.out.println( x.toString());
    }
}
/*
 * F2.java:6: error: cannot find symbol
       x.talk();
        ^
  symbol:   method talk()
  location: variable x of type aaa
F2.java:7: error: cannot find symbol
       x.laugh();
        ^
  symbol:   method laugh()
  location: variable x of type aaa
2 errors
 */
