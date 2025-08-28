public class Animal {
   String colour;
    int weight ;
   static String size ="small";

    public static void main(String[]args){
     
        
       
        Rabbit r1=new Rabbit ();
        r1.show();
        Rat r2=new Rat();
        r2.show();
   
   
    }
}
// IS A Relationship
 //Rabbit-----IS A------Animal
class Rabbit extends Animal{
 void show(){
    colour = "white";//Access through inheritance
    weight = 3;
    System.out.print("colour : ");
    System.out.println(colour);
    System.out.print("weight : ");
     System.out.println(weight);
     System.out.print("size :");
     System.out.println(size);
     }

     
    
   
    }



//Rat------- IS A--------- Relationship
class Rat extends Animal{
    void show(){
        colour = "Black";
        weight = 2;
        System.out.print("colour : ");
        System.out.println(colour);
        System.out.print("weight : ");
        System.out.println(weight);
        System.out.print("size :");
        System.out.println(size);
     
    }

     }




