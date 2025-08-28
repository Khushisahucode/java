
import java.io.FileNotFoundException;
import java.io.FileReader;
 class create_ownException6{
 public static void main(String[]args){
     System.out.println("S");
        bbb();
System.out.println("E");
 }

 static void bbb(){
         System.out.println("J");
        aaa();
         System.out.println("K");
    }
    static void aaa(){
   System.out.println("Q");
  
       ccc();
   
    System.out.println("D");
    }
    
    static void ccc() {
        System.out.println("Y");
        try {
        int y=12/0;
        } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
        e.printStackTrace();
        } 
        
        
         System.out.println("H");

    }
}
// S
// J
// Q
// Y
// / by zero
// java.lang.ArithmeticException: / by zero
//         at create_ownException6.ccc(create_ownException6.java:27)
//         at create_ownException6.aaa(create_ownException6.java:19)
//         at create_ownException6.bbb(create_ownException6.java:13)
//         at create_ownException6.main(create_ownException6.java:7)
// H
// D
// K
// E