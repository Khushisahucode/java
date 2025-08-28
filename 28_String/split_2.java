public class split_2 {
    
     public static void main(String[] args) {
        String x="mohan99is4a567good89boy";
        String[] y=x.split("\\d\\d");
     System.out.println("new string = "+y);
  System.out.println("old string = "+x);
 for(String str:y){
   System.out.println("new string = "+str);
 }
}
}
// old string = mohan99is4a567good89boy
// new string = mohan
// new string = is4a
// new string = 7good
// new string = boy
