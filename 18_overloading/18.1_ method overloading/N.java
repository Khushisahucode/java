
public class N {
    public static void main(String[]args){
     bathua b=new bathua();
       prepareleafvegetable(b);
     //preparebathuavegetable(b);
     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

     chorai c=new chorai();
     prepareleafvegetable(c);
    // preparechoraivegetable(c);

    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
     norpa n=new norpa();
     prepareleafvegetable(n);
      //preparenorpavegetable(n);
    }
     //static void preparenorpavegetable(norpa a)
      
      static void prepareleafvegetable(norpa a){
   System.out.println("prepare norpa .....");
   System.out.println("......step 1");
   System.out.println("......step 4");
   System.out.println("......step 5");
   System.out.println("......step 8");


    }

   //static void  preparechoraivegetable(chorai a)
   static void prepareleafvegetable(chorai a){
    System.out.println(" prepare chorai.........");
    System.out.println("......step 1");
System.out.println("......step 3");
System.out.println("......step 9");
System.out.println("......step 7");

    }


  //static void preparebathuavegetable(bathua b)
  static void prepareleafvegetable(bathua a)       {
    System.out.println("prepare bathua ........");
    System.out.println("......step 2");
    System.out.println("......step 7");
System.out.println("......step 9");
System.out.println("......step 5");

  }
}
