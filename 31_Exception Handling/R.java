
import java.io.FileNotFoundException;

public class R {
    
  public static void main(String[] args) {
      try {
          //checked exception
      } catch (FileNotFoundException e){
      }
  }
}
// R.java:9: error: exception FileNotFoundException is never thrown in body of corresponding try statement
//       } catch (FileNotFoundException e){
//         ^
// 1 error