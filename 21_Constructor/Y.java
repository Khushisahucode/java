class student {
    String name;
    int age;

}


public class Y {
  public static void main(String[] args) {
      student s=new student();
      System.out.println("name :" + s.name);
      System.out.println(" age :" + s.age);
      s.name="khushi";
      s.age=22;
      System.out.println( "name : "+s.name);
      // provided by compilor tostring
      System.out.println("compilor provided tostring :" +s.name.toString());
      System.out.println("age :" +s.age);
  }
    
}
