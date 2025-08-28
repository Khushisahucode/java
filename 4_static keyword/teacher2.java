public class teacher2 {
    
    int salary;
    String name;
   static int maxage = 60;
    public static void main(String[]args)
     {  
      System.out.println("teachers details are here :");
      teacher2 t1 =new teacher2();
       t1.name ="miss shaalu";
       t1.salary=25000;
       t1.maxage=34;
      teacher2 t2=new teacher2();
       t2.name="zeba ";
       t2.salary=20000;
       t2.maxage=30;
       t1.show();
       t2.show();
      teacher2 t3 =new teacher2();
       t3.name="sonam rajpoot";
       t3.salary=340000;
       t3.show();
       t3.maxage=45;
       
       System.out.println("after changing maxage :");
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


