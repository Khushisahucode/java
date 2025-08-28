public class concat_3 {
    public static void main(String[] args) {
        String x="khushi";
        
         String y=x.concat(new Student());   //Not Ok
      
        System.out.println(" old string  = "+x);
  System.out.println(" concated string  = "+y);
  
    }
 }
 
// concat_3.java:5: error: incompatible types: Student cannot be converted to String
//          String y=  x.concat(new Student());//notok
//                              ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error