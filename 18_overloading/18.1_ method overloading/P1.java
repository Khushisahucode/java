  public class P1{
    public static void main(String[] args) {
    milk m=new milk();
    water w=new water() ;
    suger s=new suger() ;
    herbs h=new herbs();
    tealeaves t=new tealeaves();
    //milktea(w,s,t,m);
    tea(w,s,t,m);
   // blacktea(w,s,t);
    tea(w,s,t);
    //herbaltea(w,s,h);
    tea(w,s,h);

   }
    
  //static void blacktea(water a,suger b,tealeaves c) 
 static void tea( water a,suger b,tealeaves c){
   System.out.println(" prepare blacktea.......");
   System.out.println("step 1....");
   System.out.println("step 4....");
   System.out.println("step 8....");

 }
 //static void milktea(water a,suger b,tealeaves c,milk d)
  static void tea( water a,suger b,tealeaves c,milk d){
   System.out.println(" prepare milktea.......");
   System.out.println("step 3....");
   System.out.println("step 6....");
   System.out.println("step 4....");
 }
//static void herbaltea(water a,suger b,tealeaves c)
static void tea( water a,suger b,herbs e){
      System.out.println(" prepare herbaltea.......");
      System.out.println("step 1....");
      System.out.println("step 9....");
      System.out.println("step 3....");
    }
   }
