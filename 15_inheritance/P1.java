class livingbeing {

}
class animal extends livingbeing{

}
class cat extends animal{

}
class cow extends animal{

}
class dog extends animal{

}
class Bdog extends dog{

}
class human extends livingbeing{

}
class plant extends livingbeing{

}
 public class P1{
public static void main(String[]args){
    Bdog x = new Bdog();
   System.out.println(x instanceof Bdog );
   System.out.println(x instanceof Object );
   System.out.println(x instanceof dog );
   System.out.println(x instanceof livingbeing );
   System.out.println(x instanceof animal );
   class livingbeing {

   }
   class animal extends livingbeing{

   }
   class cat extends animal{

   }
   class cow extends animal{

   }
   class dog extends animal{

   }
   class Bdog1 extends dog{

   }
   class human extends livingbeing{

   }
class plant extends livingbeing{

}
class P{
   public static void main(String[]args){
       Bdog1 x = new Bdog1();
      System.out.println(x instanceof Bdog1 );
      System.out.println(x instanceof Object );
      System.out.println(x instanceof dog );
      System.out.println(x instanceof livingbeing );
      System.out.println(x instanceof animal );
      System.out.println(x instanceof human );

      System.out.println(x instanceof cat);
      System.out.println(x instanceof cow );
      
      /*
       * P1.java:65: error: incompatible types: Bdog1 cannot be converted to human
      System.out.println(x instanceof human );
                         ^
P1.java:67: error: incompatible types: Bdog1 cannot be converted to cat
      System.out.println(x instanceof cat);
                         ^
P1.java:68: error: incompatible types: Bdog1 cannot be converted to cow
      System.out.println(x instanceof cow );
                         ^
3 errors
       */


      








   }
}







}
}






    



