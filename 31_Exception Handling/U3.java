
import java.io.FileNotFoundException;
import java.io.FileReader;
 class U3{
 public static void main(String[]args){
     System.out.println("S");
       try {
           bbb();
       } catch (Exception e) {
        System.out.println(e);
       }
    
System.out.println("E");
 }

 static void bbb()throws FileNotFoundException{
         System.out.println("J");
          aaa();
        System.out.println("K");
 }
static void aaa() throws FileNotFoundException{
   System.out.println("Q");
    ccc();
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
// E
