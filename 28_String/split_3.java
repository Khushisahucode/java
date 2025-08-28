public class split_3 {
    
    
     public static void main(String[] args) {
        String x="mohan99is4a567good89boy";
        String[] y=x.split("\\d\\d\\d");
     System.out.println("new string = "+y);
  System.out.println("old string = "+x);
 for(String str:y){
   System.out.println("new string = "+str);
 }
}
}
// new string = [Ljava.lang.String;@65b54208
// old string = mohan99is4a567good89boy
// new string = mohan99is4a
// new string = good89boy
