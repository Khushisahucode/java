class Drunnable implements Runnable{
   public void run(){
      Thread t=Thread.currentThread();
        System.out.println( " priority : "+t.getPriority());
   }
}
class D{
    public static void main(String[]args){
        Thread t=Thread.currentThread();
     Drunnable x=new Drunnable();
     Thread t2=new Thread(x,"A");
     t2.setPriority(Thread.MIN_PRIORITY);
     t2.start();
     System.out.println( "Thread name :"+t2.getName());
    }
}
// Thread name :A
//  priority : 1