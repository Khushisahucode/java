public class A4 {
    
     public static void main(String []args){
     Boolean x= new Boolean(10<56);
     Boolean y= new Boolean(11>0);
     Boolean z= new Boolean(10==10);
     System.out.println(x);
System.out.println(y);
System.out.println(z);

    }
}
// A4.java:4: warning: [removal] Boolean(boolean) in Boolean has been deprecated and marked for removal
//      Boolean x= new Boolean(10<56);
//                 ^
// A4.java:5: warning: [removal] Boolean(boolean) in Boolean has been deprecated and marked for removal
//      Boolean y= new Boolean(11>0);
//                 ^
// A4.java:6: warning: [removal] Boolean(boolean) in Boolean has been deprecated and marked for removal
//      Boolean z= new Boolean(10==10);
//                 ^
// 3 warnings
// true
// true
// true