
import java.io.FileNotFoundException;
import java.io.FileReader;
 class U2{
 public static void main(String[]args){
     System.out.println("S");
        bbb();
System.out.println("E");
 }

 static void bbb(){
         System.out.println("J");
        
        try {
            aaa();
        } catch (Exception e) {
            System.out.println(e);
        }
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
// K
// E
