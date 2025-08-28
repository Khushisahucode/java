public class split_1 {
     public static void main(String[] args) {
        String x="mohan is good boy";
        String[] y=x.split(" ");
     System.out.println("new string = "+y);
  System.out.println("old string = "+x);
 for(String str:y){
   System.out.println("new string = "+str);
 }
}
}
// new string = [Ljava.lang.String;@372f7a8d
// old string = mohan is good boy
// new string = mohan
// new string = is
// new string = good
// new string = boy