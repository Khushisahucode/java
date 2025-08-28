import java.util.Vector;
public class THread_safety_4 {   Vector<String>x=new Vector<String>();
    public static void main(String[]args){
          Myrunnable r=new Myrunnable();
          Myrunnable2 r1=new Myrunnable2();
          Thread s1=new Thread(r,"A");
          Thread s2=new Thread(r1,"B");
          s2.start();
          s1.start();
     try { s1.join(); s2.join();} catch (InterruptedException e) { e.printStackTrace(); }}
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
                 System.out.println( "Added Value in Vector is  "+ next+ "......."+ s.getName());} } } 
     void BB(){
        synchronized(x){    Thread s=Thread.currentThread();
                  for(String next:x){
                  try {s.sleep(1000); } catch (InterruptedException e) {}
                 System.out.println( "Added Value in Vector is  "+ next+ "......."+ s.getName());} } } }
class Myrunnable implements Runnable{
    THread_safety_4 x2=new THread_safety_4();
    public void run(){
     x2.AA(); }} 
class Myrunnable2 implements Runnable{
    THread_safety_4 x2=new THread_safety_4();
    public void run(){
     x2.BB();
    }
} 
// Added Value in Vector is  om.......A
// Added Value in Vector is  khushi.......A
// Added Value in Vector is  madhu.......A
// Added Value in Vector is  Ashika.......A
// Added Value in Vector is  aadi.......A
// Added Value in Vector is  riya.......A