class H{
    public static void main(String[]args){
        car  x=new sportscar ();
        if(x instanceof bus  ){
         System.out.println("sportscar IS A bus ");
        }
       else{
         System.out.print("sportscar  IS  not A bus   ");
       }
    
     }
}/*
C:\Users\sahuj\java coaching code\polymorphism>javac H.java
H.java:4: error: incompatible types: car cannot be converted to bus
        if(x instanceof bus  ){
           ^
1 error
 */