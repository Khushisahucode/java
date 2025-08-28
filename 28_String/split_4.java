public class split_4 {
    

    
    
     public static void main(String[] args) {
        String x="mohan9is4a7good8boy";
        String[] y=x.split("\\d");
     System.out.println("new string = "+y);
  System.out.println("old string = "+x);
 for(String str:y){
   System.out.println("new string = "+str);
 }
}
 }
// new string = [Ljava.lang.String;@65b54208
// old string = mohan9is4a7good8boy
// new string = mohan
// new string = is
// new string = a
// new string = good
// new string = boy