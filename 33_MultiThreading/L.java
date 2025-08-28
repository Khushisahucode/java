public class L {
  public static void main(String[]args){
    AThread t=new AThread();
     
     t.start();
     t.setName("golu"); 

    Thread x=Thread.currentThread();
   
    for(int i=0;i<30;i++){
      System.out.println(i + "-main()-"+ x.getName());
    }
  }
}
class AThread extends Thread{
   public void run() throws InterrptedException{
     Thread x=Thread.currentThread();
    

     for(int i=0;i<30;i++){
        if(i==15){
              Thread.sleep(1000);
        }
      System.out.println(i + " run()-"+ x.getName());
    }

  }
}
// L.java:16: error: run() in AThread cannot implement run() in Runnable
//    public void run() throws InterrptedException{
//                ^
//   overridden method does not throw InterrptedException
// 2 errors