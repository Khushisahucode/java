public class K {
     public static void main(String[] args) {
           
        int age=Integer.parseInt("mohan");
          System.out.println(age + 2);
        }
    }
 /*
  * Exception in thread "main" java.lang.NumberFormatException: For input string: "mohan"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:588)
        at java.base/java.lang.Integer.parseInt(Integer.java:685)
        at K.main(K.java:4)
  */
