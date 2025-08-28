
class student3 {
    String name;
    int age;
    student3(String name,int age){
       name =name; //----> constructor property
 /*object property<-----*/ age = age;
    }

}


public class Y3 {
  public static void main(String[] args) {
      student3 s3=new student3("madhu",18);
      System.out.println("name :" + s3.name);
      System.out.println(" age :" + s3.age);
      s3.name="khushi";
        s3.age=22;
      System.out.println( "name : "+s3.name);
      // provided by compilor tostring
      System.out.println("compilor provided tostring() :" +s3.name.toString());
      System.out.println("                       age :" +s3.age);
  }
    
}
/*
 * name :null
 age :0
name : khushi
compilor provided tostring() :khushi
                       age :22

 */
