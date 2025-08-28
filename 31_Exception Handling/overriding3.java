import java.io.FileNotFoundException;
     import java.io.IOException;
public class overriding3 {
   void pro()throws IOException {

   }
   public static void main(String[] args) {
    
   }
}

class y extends overriding3{

    void pro() throws ArrayIndexOutOfBoundsException{//newer  unchecked Exception
 
    }
}
