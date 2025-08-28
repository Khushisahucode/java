public class lastindexof_3 {
    
     public static void main(String[] args) {
      String str = "om is a good boy and he is my best friend and he is in class 10th";
      System.out.println("index is = " + str.lastIndexOf("is"));
      System.out.println("index is = " + str.lastIndexOf("is", 48));
      System.out.println("index is = " + str.lastIndexOf("and"));
      System.out.println("index is = " + str.lastIndexOf("and", 41));
   }
}
