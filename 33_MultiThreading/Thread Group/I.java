

class DRunnable implements Runnable{
   public void  run(){ Thread  t=Thread.currentThread();
   try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
   System.out.println(" DThread's components :");
        System.out.println("name : "+t.getName() );
         System.out.println("ID : "+t.getId() );
          System.out.println("Priority : "+t.getPriority() );
}}
class I{
    public static void main(String[]args){
        Thread  t=Thread.currentThread();
       DRunnable x=new DRunnable();
       Thread y= new Thread(x,"A");
       y.start();
       t.setPriority(8);

        System.out.println("default Thread components :");
        System.out.println("name : "+t.getName() );
         System.out.println("ID : "+t.getId() );
          System.out.println("Priority : "+t.getPriority() );
          //t.setPriority(8);
}}
// default Thread components :
// name : main
// ID : 1
// Priority : 8
//  DThread's components :
// name : A
// ID : 20
// Priority : 5

         
    
    
