public class Student {
    String name;
    String  degree;
    int rollno;
    Student(){

    }
    public static void main(String[] args) {
        Student s=new Student();
        s.name="khushi";
        s.age =22;
        s.salary=400000;
        System.out.println("name :"+s.name);
        System.out.println("phone :"+s.phone);
        System.out.println("department :"+s.department);
        System.out.println(" age :"+s.age);
    
    }
}
/*
 * Student.java:11: error: cannot find symbol
        s.age =22;
         ^
  symbol:   variable age
  location: variable s of type Student
Student.java:12: error: cannot find symbol
        s.salary=400000;
         ^
  symbol:   variable salary
  location: variable s of type Student
Student.java:14: error: cannot find symbol
        System.out.println("phone :"+s.phone);
                                      ^
  symbol:   variable phone
  location: variable s of type Student
Student.java:15: error: cannot find symbol
        System.out.println("department :"+s.department);
                                           ^
  symbol:   variable department
  location: variable s of type Student
Student.java:16: error: cannot find symbol
        System.out.println(" age :"+s.age);
                                     ^
  symbol:   variable age
  location: variable s of type Student
5 errors

 */
