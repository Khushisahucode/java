public class U {
    public static void main(String[] args) {
      Short  x=pro();
      //internally compilor ---> Boxing
      //System.out.println("value of a : "+ x.shortValue());
      System.out.println(x);
    
    } 
   static short pro(){
    Short a=34;
    
    //----> unboxing 
     // return a.shortValue();                     //internally compilor
    return a;
  }
}
//value of a : 34