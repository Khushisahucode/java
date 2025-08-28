class AThread implements  Runnable{
    public void run(){
        Thread x=Thread.currentThread();
         for (int i = 0; i < 5; i++) {
            System.out.println(x.getName()+" going to withdraul 10 RS current balance is : "+ A.ac.getbalance());
            A.ac.withdraul(10);
            System.out.println("after withdraul current balance is : "+ A.ac.getbalance());}
        }
    }
public class A {
    static Account ac=new Account(50,"454646","saving");
    public static void main(String[] args) {
        AThread r=new AThread();
        Thread t1= new Thread(r,"mohan");
         Thread t2= new Thread(r,"sohan");
         t1.start();
         t2.start(); }
}
// sohan going to withdraul 10 RS current balance is : 50
// mohan going to withdraul 10 RS current balance is : 50
// after withdraul current balance is : 40
// sohan going to withdraul 10 RS current balance is : 30
// after withdraul current balance is : 30
// mohan going to withdraul 10 RS current balance is : 20
// after withdraul current balance is : 20
// after withdraul current balance is : 10
// sohan going to withdraul 10 RS current balance is : 10
// mohan going to withdraul 10 RS current balance is : 10
// after withdraul current balance is : 0
// mohan going to withdraul 10 RS current balance is : 0
// after withdraul current balance is : 0
// after withdraul current balance is : 0
// mohan going to withdraul 10 RS current balance is : 0
// sohan going to withdraul 10 RS current balance is : 0
// after withdraul current balance is : 0
// after withdraul current balance is : 0
// sohan going to withdraul 10 RS current balance is : 0
// after withdraul current balance is : 0