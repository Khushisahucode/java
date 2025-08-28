public class equals_constraint {
    public static void main(String[] args) {
        Employee_2 x=new Employee_2("hitesh",23);
         Employee_2 y=new Employee_2("hitesh",42);
          Employee_2 z=new Employee_2("sohan",23);
           Employee_2 z1=new Employee_2("mohan",33);
           //Reflexive ---->true
          System.out.println("Reflexive :  ");
          System.out.println(x.equals(x));
           System.out.println(z.equals(z));
            System.out.println(y.equals(y));
               
            //Symmmetric
            System.out.println("Symmetric :  ");
             System.out.println(x.equals(z));
             System.out.println(z.equals(x));
             
             //Transitive
              System.out.println("Transitive :  ");
              System.out.println(x.equals(z));
               System.out.println(z.equals(z1));
                System.out.println(x.equals(z1));
                
                //Consistant
                 System.out.println("Consistant :  ");
                 System.out.println(x.equals(y)); 
                 System.out.println(x.equals(y));
                  System.out.println(x.equals(y));
                  
                  //compare to null --->false
                  System.out.println("Compare to null  :  ");
                   System.out.println(x.equals(null));
     
    }
}
// Reflexive :  
// true
// true
// true
// Symmetric :  
// false
// false
// Transitive :  
// false
// false
// false
// Consistant :
// true
// true
// true
// Compare to null  :
// false


