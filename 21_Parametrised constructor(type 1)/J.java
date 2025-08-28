class j1{
    j1(int x){
       System.err.println("hello");
    }
}


public class J extends j1 {
  J(){
    super(pro());
  }
      int  pro(){
    return 22;
 }
 public static void main(String[] args) {
     J x=new J();
     
 }
    
}
/*
 * J.java:10: error: cannot reference pro() before supertype constructor has been called
    super(pro());
          ^
1 error

 */
