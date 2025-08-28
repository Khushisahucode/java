public class X {
    
    public static void main(String[] args) {
        Integer x=45;              //internally compilor (unBoxing)
        System.out.println( "value of x : "+x);    //int temp= intvalue();
      x++;
      System.out.println("value of x : "+x);    //x.valueOf(temp)
    }
}
// value of x : 45
// value of x : 46