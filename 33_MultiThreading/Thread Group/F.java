class AThread extends Thread{
   public void  run(){
   try {
       Thread.sleep(1000);
   } catch (Exception e) {e.printStackTrace();
   }
    }
}

class F{
    public static void main(String[]args){
        ThreadGroup x=Thread.currentThread().getThreadGroup();
        AThread a=new AThread();
        a.setName("bheem");
        a.start();
        AThread a2=new AThread();
        a2.setName("raju");
        a2.start();
         
       x.list();
           }
}
// java.lang.ThreadGroup[name=main,maxpri=10]
//     Thread[#1,main,5,main]
//     Thread[#20,bheem,5,main]
//     Thread[#21,raju,5,main]