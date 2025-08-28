public class U {
   int count = 0;
 public static void main(String[] args) {
      U t = new U();
      System.out.println("A");

      try {
         t.pro();
      } catch (Throwable e) {
         System.out.println(e);
      } finally {
         System.out.println("essential code");
      }

      System.out.println("E");
   }
      void pro() {
      System.out.println(count++);
      pro();
   }
}



// 15573
// 15574
// 15575
// 15576
    


    



// 16574
// 16575
// 16576
// 16577
// 16578
// 16579
// java.lang.StackOverflowError
// essential code
// E