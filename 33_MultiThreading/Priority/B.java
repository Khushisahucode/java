class Brunnable implements Runnable{
   public void run(){
      Thread t=Thread.currentThread();
        System.out.println( " priority : "+t.getPriority());
   }
}
class B{
    public static void main(String[]args){
        Thread t=Thread.currentThread();
     Brunnable x=new Brunnable();
     Thread t2=new Thread(x,"A");
     t2.setPriority(Thread.MAX_PRIORITY);
     t2.start();
     System.out.println( "Thread name :"+t2.getName());
    }
}
// Thread name :A
//  priority : 10