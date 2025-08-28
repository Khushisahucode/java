import java.io.FileNotFoundException;
     import java.io.IOException;
public class overriding6 {
   void pro()throws NocommandLineArguementException {

   }
   public static void main(String[] args) {
    
   }
}

class y extends overriding6{

    void pro() throws    IoException{ //checked Exception newer

    }
}
//     void pro() throws    IOException/*NocommandLineArguementException */{
//          ^
//   overridden method does not throw IOException
// 1 error