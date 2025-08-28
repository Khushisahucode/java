public class hashcode_contract {
    public static void main(String[] args) {
        Employee_2 e=new Employee_2("mohan", 12);
         Employee_2 e1=new Employee_2("mohan", 12);
          Employee_2 e2=new Employee_2("hanmo", 12);
           //Test first
           System.out.println(e.hashCode()); //pass
            System.out.println(e.hashCode());
             System.out.println(e.hashCode());
             //Test Second
              System.out.println(e.equals(e1));  //fail
               System.out.println(e.hashCode());
                System.out.println(e1.hashCode());
        
                 //Test Three
                  System.out.println(e.equals(e2));  //fail
                   System.out.println(e1.hashCode());
                    System.out.println(e2.hashCode());
    }
}
// 798154996
// 798154996
// 798154996
// true
// 798154996
// 681842940
// false
// 681842940
// 1392838282