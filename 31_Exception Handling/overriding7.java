import java.io.FileNotFoundException;
     import java.io.IOException;
public class overriding7 {
   void pro()throws NocommandLineArguementException {

   }
   public static void main(String[] args) {
    
   }
}

class y extends overriding7{
    void pro() throws   WrongcommandLineException /*missingcommandLineArguementException*/{//checked Exception  newer

    }
}
class wrongcommandlineException extends IOException{

}