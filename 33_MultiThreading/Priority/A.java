  class Arunnable implements Runnable{
   public void run(){
      Thread t=Thread.currentThread();
        System.out.println( " priority : "+t.getPriority());
   }
}
class A{
    public static void main(String[]args){
        Thread t=Thread.currentThread();
     Arunnable x=new Arunnable();
     Thread t2=new Thread(x,"A");
     t2.setPriority(12);
     t2.start();
     System.out.println( "Default Thread name :"+t.getName());
    }
}
// Exception in thread "main" java.lang.IllegalArgumentException
//         at java.base/java.lang.Thread.setPriority(Thread.java:1823)
//         at A.main(A.java:12)