import java.util.Vector;
class  Thread_safety{
   // static Vector<String>x=new Vector<String>();
      
    public static void main(String[] args) {
         Vector<String>x=new Vector<String>();
      
      // x.add("om");
      //   x.add("khushi");
      //   x.add("madhu");
      //   x.add("om");
      //   x.add("aadi");
      //   x.add("riya");
       Arunnable a=new Arunnable(x);
       Thread z1=new Thread(a,"A");
       
      Brunnable  b=new Brunnable(x);
       Thread z2=new Thread(b,"B");
       z1.start();
       z2.start();
   try {
       z1.join();
       z2.join();
   } catch (InterruptedException e) { e.printStackTrace();
   }
      }
     }
    class Arunnable  implements Runnable{ Thread t=Thread.currentThread();
       Vector<String>z;
    Arunnable(Vector<String>y){    z=y;}
    public void run(){
       synchronized (z){
         z.add("om");
        z.add("khushi");
        z.add("madhu");
        z.add("Ashika");
        z.add("aadi");
        z.add("riya");
         for (String next: z) {
           
   System.out.println( t.getName()+"  _Vector is : " + z.contains("Mohan"));} } }
}
class Brunnable implements Runnable{  
  Vector<String>z1;
  Thread t=Thread.currentThread();
   Brunnable(Vector<String>y1){    z1=y1;}
       public void run(){
         synchronized (z1){ 
          for (String next: z1) {
           System.out.println( t.getName()+"  _Vector is contains mohan : " + next); } } }
      }
     
    
