import java.util.Vector;
public class Thread_safety_3 {   Vector<String>x=new Vector<String>();
    public static void main(String[]args){
          Myrunnable r=new Myrunnable();
          Thread r1=new Thread(r,"A");
          Thread r2=new Thread(r,"B");
          r1.start();
          r2.start();
      try {
       r1.join();
       r2.join();
   } catch (InterruptedException e) { e.printStackTrace(); }}
    void AA(){
        synchronized(x){    Thread s=Thread.currentThread();
                x.add("om");
                x.add("khushi");
                x.add("madhu");
                x.add("Ashika");
                x.add("aadi");
                x.add("riya");
            for(String next:x){
                  try {s.sleep(1000); } catch (InterruptedException e) {}
                 System.out.println( "Added Value in Vector is  "+ next+ "......."+ s.getName());} } } }
class Myrunnable implements Runnable{
    Thread_safety_3 x2=new Thread_safety_3();
    public void run(){
     x2.AA();
    }
} 
//output  :
// A_Vector Elements is  om
// A_Vector Elements is  khushi
// A_Vector Elements is  madhu
// A_Vector Elements is  Ashika
// A_Vector Elements is  aadi
// A_Vector Elements is  riya
// B_Vector Elements is  om
// B_Vector Elements is  khushi
// B_Vector Elements is  madhu
// B_Vector Elements is  Ashika
// B_Vector Elements is  aadi
// B_Vector Elements is  riya
// B_Vector Elements is  om
// B_Vector Elements is  khushi
// B_Vector Elements is  madhu
// B_Vector Elements is  Ashika
// B_Vector Elements is  aadi
// B_Vector Elements is  riya