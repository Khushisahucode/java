
import java.io.FileNotFoundException;
     import java.io.IOException;
public class overriding2 {
   void pro()throws IOException {

   }
}

class y extends overriding2{
              //fewer Exception
    void pro() throws IOException ,FileNotFoundException{

    }
}

