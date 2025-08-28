class x1{
    private  x1(){
 
     }
 
 }
 class D extends x1{
    D(){
    super();
    }
     public static void main(String[] args) {
         
     }
 }
/*
 * D.java:9: error: x1() has private access in x1
    super();
    ^
1 error
 */