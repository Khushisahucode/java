public class M {
    public static void main(String[]args){
     bathua b=new bathua();
     preparebathuavegetable(b);
     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

     chorai c=new chorai();
     preparechoraivegetable(c);
     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

     norpa n=new norpa();
      preparenorpavegetable(n);
    }
     static void preparenorpavegetable(norpa a){
   System.out.println("prepare norpa .....");
   System.out.println("......step 1");
   System.out.println("......step 4");
   System.out.println("......step 5");
   System.out.println("......step 8");


    }

   static void  preparechoraivegetable(chorai a){
    System.out.println(" prepare chorai.........");
    System.out.println("......step 1");
System.out.println("......step 3");
System.out.println("......step 9");
System.out.println("......step 7");

    }


  static void preparebathuavegetable(bathua b){
    System.out.println("prepare bathua ........");
    System.out.println("......step 2");
    System.out.println("......step 7");
System.out.println("......step 9");
System.out.println("......step 5");

  }
}
