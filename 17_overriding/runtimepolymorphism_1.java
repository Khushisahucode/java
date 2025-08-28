 class runtimepolymorphism_1       {
  static void playsound(animal x){
   x.makesound();
  }
static void playsound(cat x){
  x.makesound();
}
  
  static void playsound(cow x){
    x.makesound();

  }
  
    
 /*static void playsound(animal x){
  
    x. makesound();}*/

    
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
   * dog  sound......
     cat sound......
     cow sound......

   */
   

