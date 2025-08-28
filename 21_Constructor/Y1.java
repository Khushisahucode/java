
    class student1 {
        String name;
        int age;
        student1(String n,int a){
            name =n;
            age = a;
        }
    
    }
    
    
    public class Y1 {
      public static void main(String[] args) {
          student1 s1=new student1("madhu",18);
          System.out.println("name :" + s1.name);
          System.out.println(" age :" + s1.age);
          s1.name="khushi";
          s1.age=22;
          System.out.println( "name : "+s1.name);
          // provided by compilor tostring
          System.out.println("compilor provided tostring() :" +s1.name.toString());
          System.out.println("                       age :" +s1.age);
      }
        
    }

    

