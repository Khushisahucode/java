///dynamic method dispatch
class runtimepolymorphism_2       {
  /*  static void playsound(dog x){
      System.out.println("dog sound...");
    }
  
  static void playsound(cat x){
      System.out.println("cat sound...");
    }
    
    static void playsound(cow x){
      System.out.println("cow sound...");
    }
    */
      
   static void playsound(animal x){
    
      x. makesound();
    }
  
      
  public static void main(String[]args){
       dog a=new dog();
       playsound(a);
       cat  b=new cat();
       playsound(b);
       cow c=new cow ();
       playsound(c);
      }
    } 
/*
 * dog sound...
   cat sound...
   cow sound...
 *
 */