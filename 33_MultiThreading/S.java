class S{
    static Thread x=Thread.currentThread();
    public static void main(String[]args) throws InterruptedException{
    SThread a=new SThread();
    a.setName("A");
    a.start();
     Thread t=x;
     for(int i=0;i<30;i++){
        if(i==15){
            a.join();
        }
        System.out.println(i+" ~~~"+ t.getName());
     }
    }
}
class SThread extends Thread{
   public  void run(){
    Thread t=Thread.currentThread();
     for(int i=0;i<30;i++){
        if (i==15) {
            try {
                S.x.join();
            } catch (InterruptedException e) { 
            e.printStackTrace();
            }
            }
        System.out.println(i+"...... "+ t.getName());
     }
 }
}
// 0...... A
// 1...... A
// 0 ~~~main
// 2...... A
// 1 ~~~main
// 3...... A
// 2 ~~~main
// 3 ~~~main
// 4...... A
// 4 ~~~main
// 5 ~~~main
// 5...... A
// 6 ~~~main
// 7 ~~~main
// 6...... A
// 7...... A
// 8 ~~~main
// 8...... A
// 9...... A
// 9 ~~~main
// 10 ~~~main
// 11 ~~~main
// 12 ~~~main
// 13 ~~~main
// 10...... A
// 11...... A
// 14 ~~~main
// 12...... A
// 13...... A
// 14...... A
