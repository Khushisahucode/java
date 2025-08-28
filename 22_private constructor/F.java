class x3{
    private  x3(){
 
     }
 
 }
 class F {
    F(){
    super();
    }
     public static void main(String[] args) {
        x3 z = new x3();
     }
 }
 /*
  * F.java:12: error: x3() has private access in x3
        x3 z = new x3();
               ^
1 error

  */