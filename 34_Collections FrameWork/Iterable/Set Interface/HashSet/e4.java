public class e4{
    public static void main(String[] args) {
        Employee_2 x=new Employee_2("hitesh",23);
         student y=new student("hitesh",42);
          Employee_2 z=new Employee_2("hitesh",23);
          System.out.println(x.equals(z));
          System.out.println(x.equals(y));
           System.out.println(y.equals(z));
            
     
    }
}
// true
// false
// false
