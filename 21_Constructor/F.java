 enum x1 {
  // constructor defintion 
   // allowed 
    x1(){


}
}
 public class F{
public static void main(String[] args) {
   //constructor call
   //not ok
    x1 z = new x1();

}
}
/*
 * F.java:13: error: enum classes may not be instantiated
    x1 z = new x1();
           ^
1 error
 */
