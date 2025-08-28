import java.io.FileNotFoundException;
import java.io.FileReader;
 class U1{
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
   try {
       ccc();
   } catch (Exception e) {
     System.out.println(e);
   }
    System.out.println("D");
    }
    
    static void ccc() throws FileNotFoundException{
        System.out.println("Y");
        FileReader x=new FileReader("abc.text");
         System.out.println("H");

    }
}
// S
// J
// Q
// Y
// java.io.FileNotFoundException: abc.text (The system cannot find the file specified)
// D
// K
// E