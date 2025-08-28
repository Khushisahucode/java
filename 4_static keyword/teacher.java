public class teacher {
    int salary;
    String name;
   static int maxage = 60;
    public static void main(String[]args)
     {  
      System.out.println("teachers details are here :");
      teacher t1 =new teacher();
       t1.name ="miss shaalu";
       t1.salary=25000;
      teacher t2=new teacher();
       t2.name="zeba ";
       t2.salary=20000;
      teacher t3 =new teacher();
       t3.name="sonam rajpoot";
       t3.salary=340000;
       t1.show();
       t2.show();
       t3.show();

    }
  void show()
  {
    
     System.out.print("name : ");
     System.out.println(name);
     System.out.print("salary : ");
     System.out.println(salary);
     System.out.print("maxage : ");
     System.out.println(maxage );
     }
   }
    
    

