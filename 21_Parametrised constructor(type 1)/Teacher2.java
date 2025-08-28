public class Teacher2  extends user1 {
    String department;
    float salary;
   String name;
    Teacher2(String name,String department){
        super(45,12333,30000.0f,878708755);
            this.name=name;
            this.department=department;
        
          
    }
    public static void main(String[] args) {
         Teacher2 t=new Teacher2("mr gopalsingh","Computer Science");
        

        System.out.println("name :"+t.name);
        System.out.println("phone :"+t.phone);
        System.out.println("department :"+t.department);
        System.out.println(" age :"+t.age);
        System.out.println("salary :"+t.salary);
    
    }
}
//output
//when //float salary
/*
 * name :mr gopalsingh
phone :878708755
department :Computer Science
 age :45
salary :30000.0
 */
//output
 /*//float salay;declare
  * C:\Users\sahuj\java coaching code\Parametrised constructor>java Teacher2
name :mr gopalsingh
phone :878708755
department :Computer Science
 age :45
salary :0.0

  */