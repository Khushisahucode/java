public class e2 {
    public static void main(String[] args) {
        Employee x=new Employee("hitesh",23);
         student y=new student("hitesh",42);
          Employee z=new Employee("hitesh",23);
          System.out.println(x.equals(z));
          System.out.println(x.equals(y));
           System.out.println(y.equals(z));
            
     
    }
}
// true
// Exception in thread "main" java.lang.ClassCastException: class student cannot be cast to class Employee (student and Employee are in unnamed module of loader 'app')
//         at Employee.equals(Employee.java:15)
//         at e2.main(e2.java:7)