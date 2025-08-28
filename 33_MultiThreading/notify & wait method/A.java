import java.util.Scanner;

class circle {
    static Scanner sc=new Scanner(System.in);
 int radius =0;
     synchronized void write_radius(){
        Thread t=Thread.currentThread();
       if (radius==0){
            System.out.print( t.getName()+ " set new  radius :");
         radius= sc.nextInt();
        notify();
        }else{
            try{  
            System.out.println("~~~");
            wait();} catch(InterruptedException e){  e.printStackTrace(); }
         }}
    
     public synchronized void readradius(){
         Thread t2=Thread.currentThread();
  {if (radius!=0){System.out.println(t2.getName()+"  radius is : " + radius );
         radius= 0;
         notify();
        }else{
            try{ 
        System.out.println( " ~~~~");
        wait();} catch(InterruptedException e){  e.printStackTrace(); }
            }
    }
}}


class Produser extends Thread{
     public void run(){
        while (true) { 
            A.c.write_radius();}
     }
}
class Consumer extends Thread{
     public void run(){
        while(true){
        A.c.readradius();
    }
     }
}
class A{
static circle  c=new circle();
    public static void main(String[] args) {
        Produser x=new Produser();
        x.setName("produser");
        Consumer y=new Consumer();
        y.setName("consumer");
         x.start();
         y.start();}
 }
// produser set new  radius :6
// ~~~
// consumer  radius is : 6
//  ~~~~
// produser set new  radius :7
// ~~~
// consumer  radius is : 7
//  ~~~~
// produser set new  radius :8
// ~~~
// consumer  radius is : 8
//  ~~~~
// produser set new  radius :8
// ~~~
// consumer  radius is : 8
//  ~~~~
// produser set new  radius :
// 9