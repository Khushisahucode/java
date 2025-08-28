public class V {
   static int count = 0;
 public static void main(String[] args) {
      
      System.out.println("A");

      try {
         pro();
      } catch (Throwable e) {
         System.out.println(e);
      } finally {
         System.out.println("essential code");
      }

      System.out.println("E");
   }

   static void pro() {
      System.out.println(count++);
      pro();
   }
}
// 14261
// 14262
// 14263
// 14264
// 14265
// 14266








// 15261
// 15262
// 15263
// 15264
// 15265
// 15266
// java.lang.StackOverflowError
// essential code
// E