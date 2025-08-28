public class hashcode_contract2 {
    public static void main(String[] args) {
        User e=new User("mohan", 12);
         User e1=new User("mohan", 12);
          User e2=new User("hanmo", 12);
           //Test first
           System.out.println("Test first : ");
           System.out.println(e.hashCode()); //pass
            System.out.println(e.hashCode());
             System.out.println(e.hashCode());
             //Test Second
             System.out.println("Test  Second : ");
              System.out.println(e.equals(e1));  //pass
               System.out.println(e.hashCode());
                System.out.println(e1.hashCode());
        
                 //Test Three
                 System.out.println("Test Third : ");
                  System.out.println(e.equals(e2));  //pass
                   System.out.println(e1.hashCode());
                    System.out.println(e2.hashCode());
    }
}
// Test first : 
// 58........mohan-12
// 58
// 58........mohan-12
// 58
// 58........mohan-12
// 58
// Test  Second : 
// mohan-12....compare To....mohan-12
// true
// 58........mohan-12
// 58
// 58........mohan-12
// 58
// Test Third :
// mohan-12....compare To....hanmo-12
// false
// 58........mohan-12
// 58
// 58........hanmo-12
// 58