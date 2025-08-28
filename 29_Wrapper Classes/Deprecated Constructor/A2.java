public class A2 {
     public static void main(String []args){
     Boolean x= new Boolean("tru");
     Boolean y= new Boolean("TrUe");
     Boolean z= new Boolean("mohan");
     System.out.println(x);
System.out.println(y);
System.out.println(z);

    }
}
// A2.java:6: warning: [removal] Boolean(String) in Boolean has been deprecated and marked for removal
//      Boolean x= new Boolean("tru");
//                 ^
// A2.java:7: warning: [removal] Boolean(String) in Boolean has been deprecated and marked for removal
//      Boolean y= new Boolean("TrUe");
//                 ^
// A2.java:8: warning: [removal] Boolean(String) in Boolean has been deprecated and marked for removal
//      Boolean z= new Boolean("mohan");
//                 ^
// 3 warnings
// false
// true
// false
