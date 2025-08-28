public class F3 {
    public static void main(String[]args)
    {
       Object x=new ccc();
       x.walk();
       x.talk();
       x.laugh();
      System.out.println( x.toString());
    }

}
/*
 * F3.java:5: error: cannot find symbol
       x.walk();
        ^
  symbol:   method walk()
  location: variable x of type Object
F3.java:6: error: cannot find symbol
       x.talk();
        ^
  symbol:   method talk()
  location: variable x of type Object
F3.java:7: error: cannot find symbol
       x.laugh();
        ^
  symbol:   method laugh()
  location: variable x of type Object
3 errors
 */
