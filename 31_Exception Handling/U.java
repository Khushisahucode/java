
    import java.io.FileNotFoundException;
import java.io.FileReader;
 class U{
 public static void main(String[]args){
     System.out.println("S");
        bbb();
System.out.println("E");
 }
    static void aaa(){
   System.out.println("Q");

       ccc();
  
   
    System.out.println("D");
    }
    static void bbb(){
         System.out.println("J");
        aaa();
         System.out.println("K");
    }
    static void ccc() {
        System.out.println("Y");
        try{
        FileReader x=new FileReader("abc.text");
        }catch(Exception e){
            System.out.println(e);
        }
         System.out.println("H");

    }

}
// S
// J
// Q
// Y
// java.io.FileNotFoundException: abc.text (The system cannot find the file specified)
// H
// D
// K
// E