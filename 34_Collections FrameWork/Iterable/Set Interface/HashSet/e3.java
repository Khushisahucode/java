public class e3 {
    public static void main(String[] args) {
        Employee_2 x=new Employee_2("hitesh",23);
         Employee_2 y=new Employee_2("hitesh",42);
          Employee_2 z=new Employee_2("hitosh",23);
          System.out.println(x.equals(y));
           System.out.println(y.equals(z));
            System.out.println(x.equals(z));
     
    }
}
// true
// false
// false