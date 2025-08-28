public class Teacher1  extends user {
    
        float salary;
        String name;
    
        int rollno;
        Teacher1(){
    
        }
        public static void main(String[] args) {
             Teacher1 t=new Teacher1();
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

