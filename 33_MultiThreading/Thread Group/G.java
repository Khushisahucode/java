class BThread extends Thread{
   public void  run(){
   try {
       Thread.sleep(1000);
   } catch (Exception e) {e.printStackTrace();
   }
    }
}

class G{
    public static void main(String[]args){
        ThreadGroup x=new ThreadGroup("dholakpur");
        BThread a=new BThread();
        a.setName("bheem");
        a.start();
        BThread a2=new BThread();
        a2.setName("raju");
        a2.start();
          BThread a3=new BThread();
        a3.setName("jaggu");
        a3.start();
        BThread a4=new BThread();
        a4.setName("kaliya");
        a4.start();
        ThreadGroup y=Thread.currentThread().getThreadGroup();
       y.list();
           }
}
