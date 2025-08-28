import java.io.FileNotFoundException;
     import java.io.IOException;
public class overriding5 {
   void pro()throws IOException {

   }
   public static void main(String[] args) {
    
   }
}

class y extends overriding5{

    void pro() throws Exception{//parent Exception ----->wider

    }
}
// overriding5.java:14: error: pro() in y cannot override pro() in overriding5
//     void pro() throws Exception{//parent Exception
//          ^
//   overridden method does not throw Exception
// 1 error