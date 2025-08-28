class ZThread implements  Runnable{
    public void run(){
        Thread x=Thread.currentThread();
         for (int i = 0; i < 5; i++) {
            System.out.println(x.getName()+" going to withdraul  current balance is : "+ E.ac.getbalance());
            E.ac.withdraul(10);}
            System.out.println("after withdraul current balance is : "+ E.ac.getbalance());
        }
    }
public class E {
    static Account5 ac=new Account5(50,"454646","saving");
    public static void main(String[] args) {
        ZThread r=new ZThread();
        Thread t1= new Thread(r,"mohan");
         Thread t2= new Thread(r,"sohan");
         t1.start();
         t2.start(); }
}
// sohan going to withdraul  current balance is : 50
// mohan going to withdraul  current balance is : 50
// sohan going to withdraul  current balance is : 40
// sohan going to withdraul  current balance is : 20
// mohan going to withdraul  current balance is : 20
// sohan going to withdraul  current balance is : 10
// sohan going to withdraul  current balance is : 0
// mohan going to withdraul  current balance is : 0
// mohan going to withdraul  current balance is : 0
// mohan going to withdraul  current balance is : 0
// after withdraul current balance is : 0
// after withdraul current balance is : 0