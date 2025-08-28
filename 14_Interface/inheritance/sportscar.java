 interface  Jumpable  {
    int x=34;
    
}

class Animal{


}
class Rabbit extends Animal implements Jumpable {

}
class Toy {

   public  int price ;
   public  String colour ;

}
class Ball extends Toy implements Jumpable{

}
class car{

}
 public class sportscar extends Ball  implements Jumpable{

    public static void main(String[]args){

        Ball  t1=new Ball();
        t1.price= 3000;
       t1.colour = "Green";
         System.out.print("  toy's price are :");
         System.out.println(t1.price);
         System.out.print(" toy's colour :");
         System.out.println(t1.colour);
         System.out.print("value of x :");
         System.out.println(x);
    
    
    
        }






}
