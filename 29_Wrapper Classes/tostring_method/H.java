public class H {
    public static void main(String[] args) {
        student a=new student();
  System.out.println("tostring() : "+ a.toString());
 System.out.println("hashCode() : "+ a.hashCode());
 String h=Integer.toString(a.hashCode());
 System.out.println(h);
}
   }
   
// tostring() : student@2f92e0f4
// hashCode() : 798154996
// 798154996
