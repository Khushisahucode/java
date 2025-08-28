public class Teacher {
        float salary;
        String name;
    
        
        Teacher(){
    
        }
        public static void main(String[] args) {
             Teacher t=new Teacher();
             t.name="mr gopal singh";
             t.age=42;
             t.salary=30000;
             t.department="CS";

            System.out.println("name :"+t.name);
            System.out.println("phone :"+t.phone);
            System.out.println("department :"+t.department);
            System.out.println(" age :"+t.age);
            System.out.println("salary :"+t.salary);
        
        }
    }
    /*
     * .java
Teacher.java:12: error: cannot find symbol
             t.age=42;
              ^
  symbol:   variable age
  location: variable t of type Teacher
Teacher.java:14: error: cannot find symbol
             t.department="CS";
              ^
  symbol:   variable department
  location: variable t of type Teacher
Teacher.java:17: error: cannot find symbol
            System.out.println("phone :"+t.phone);
                                          ^
  symbol:   variable phone
  location: variable t of type Teacher
Teacher.java:18: error: cannot find symbol
            System.out.println("department :"+t.department);
                                               ^
  symbol:   variable department
  location: variable t of type Teacher
Teacher.java:19: error: cannot find symbol
            System.out.println(" age :"+t.age);
                                         ^
  symbol:   variable age
  location: variable t of type Teacher
5 errors
     */

