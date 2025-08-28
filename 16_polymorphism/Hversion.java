public class Hversion {
    public static void main(String[]args){
        sportscar x=new sportscar();
        if(x instanceof bus ){
         System.out.println("sportscar IS-A bus");
       
          }  else{
         System.out.print("sportscar is not A bus");
    
     }
}
}
/*
 * Hversion.java:4: error: incompatible types: sportscar cannot be converted to bus
        if(x instanceof bus ){
           ^
1 error
 */