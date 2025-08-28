import java.io.FileNotFoundException;
     import java.io.IOException;
public class overriding4 {
   void pro()throws IOException {

   }
   public static void main(String[] args) {
    
   }
}

class y extends overriding4{

    void pro() throws FileNotFoundException{//narrower  checked  Exception

    }
}
