
import java.io.IOException;
import java.io.FileNotFoundException;

public class A1 {

    public static void main(String [] args){
        try{//checked exception
        FileNotFoundException x=new FileNotFoundException();
         throw x;
        }catch(Exception e){  //checked   ---->Exception 

        }
    }
}

