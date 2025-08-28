public class e1 {
    public static void main(String[] args) {
        Employee x=new Employee("hitesh",23);
         Employee y=new Employee("hitesh",42);
          Employee z=new Employee("hitosh",23);
          System.out.println(x.equals(y));
           System.out.println(y.equals(z));
            System.out.println(x.equals(z));
     
    }
}
// true
// false
// false