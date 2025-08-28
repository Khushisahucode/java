class ERunnable implements Runnable{
   public void  run(){ Thread  t=Thread.currentThread();
   try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
   System.out.println(" DThread's components :");
        System.out.println("name : "+t.getName() );
         System.out.println("ID : "+t.getId() );
          System.out.println("Priority : "+t.getPriority() );
}}
class J{
    public static void main(String[]args){
        Thread  t=Thread.currentThread();
       ERunnable x=new ERunnable();
       t.setPriority(8); //not ok  changes in child Thread
       Thread y= new Thread(x,"A");
      // t.setPriority(8);ok 
       y.start();
      // t.setPriority(8); //ok

        System.out.println("default Thread components :");
        System.out.println("name : "+t.getName() );
         System.out.println("ID : "+t.getId() );
          System.out.println("Priority : "+t.getPriority() );
          //t.setPriority(8);  ok
}}
// default Thread components :
// name : main
// ID : 1
// Priority : 8
//  DThread's components :
// name : A
// ID : 20
// Priority : 8