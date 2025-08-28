class student2 {
    String name;
    int age;
    student2(String name,int age){
       this.name =name; //----> constructor property
 /*object property<-----*/ this.age = age;
    }

}


public class Y2 {
  public static void main(String[] args) {
      student2 s2=new student2("madhu",18);
      System.out.println("name :" + s2.name);
      System.out.println(" age :" + s2.age);
      s2.name="khushi";
      s2.age=22;
      System.out.println( "name : "+s2.name);
      // provided by compilor tostring
      System.out.println("compilor provided tostring() :" +s2.name.toString());
      System.out.println("                       age :" +s2.age);
  }
    
}/*
name :madhu
 age :18
name : khushi
compilor provided tostring() :khushi
                       age :22
 */
