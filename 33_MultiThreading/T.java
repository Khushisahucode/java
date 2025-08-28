
class T{
    static Thread x=Thread.currentThread();
    public static void main(String[]args) throws InterruptedException{
    TThread a=new TThread();
    a.setName("A");
    a.start();
     Thread t=x;
    
     
     for(int i=0;i<30;i++){
        
         if(i==15){
              a.join();}
        System.out.println(i+" ~~~"+ t.getName());
        }}
    }
class TThread extends Thread{
   public  void run(){
    Thread t=Thread.currentThread();
    
     for(int i=0;i<30;i++){
                if(i==15){
            try{
                T.x.join();
            } catch (InterruptedException e) { 
             e.printStackTrace();
         }
         
        System.out.println(i+"...... "+ t.getName());
     }
 }
}
}
// 0 ~~~main
// 1 ~~~main
// 2 ~~~main
// 3 ~~~main
// 4 ~~~main
// 5 ~~~main
// 6 ~~~main
// 7 ~~~main
// 8 ~~~main
// 9 ~~~main
// 10 ~~~main
// 11 ~~~main
// 12 ~~~main
// 13 ~~~main
// 14 ~~~main
