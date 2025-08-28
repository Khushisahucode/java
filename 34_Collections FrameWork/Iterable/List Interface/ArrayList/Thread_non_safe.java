import java.util.ArrayList;
public class Thread_non_safe {   ArrayList<String>x=new ArrayList<String>();
        public static void main(String[] args) {
            
        
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
                 System.out.println( "Added Value in ArrayList is  "+ next+ "......."+ s.getName());} } } }
class Myrunnable implements Runnable{
    Thread_non_safe x2=new Thread_non_safe();
    public void run(){
     x2.AA();
    }
} 