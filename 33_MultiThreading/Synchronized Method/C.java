class XThread implements  Runnable{
    public void run(){
        Thread x=Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println(x.getName()+" going to withdraul  current balance is : "+ C.ac.getbalance());
            C.ac.withdraul(10);
            System.out.println("after withdraul current balance is : "+ C.ac.getbalance());
        }
    }
}
public class C {
    static Account3 ac=new Account3(50,"454646","saving");
    public static void main(String[] args) {
        XThread r=new XThread();
        Thread t1= new Thread(r,"mohan");
         Thread t2= new Thread(r,"sohan");
         t1.start();
         t2.start(); }
}
// mohan going to withdraul  current balance is : 50
// sohan going to withdraul  current balance is : 50
// after withdraul current balance is : 30
// after withdraul current balance is : 40
// mohan going to withdraul  current balance is : 30
// sohan going to withdraul  current balance is : 30
// after withdraul current balance is : 20
// after withdraul current balance is : 10
// sohan going to withdraul  current balance is : 10
// mohan going to withdraul  current balance is : 10
// after withdraul current balance is : 0
// after withdraul current balance is : -10
// mohan going to withdraul  current balance is : -10
// sohan going to withdraul  current balance is : -10
// after withdraul current balance is : -20
// after withdraul current balance is : -30
// mohan going to withdraul  current balance is : -30
// after withdraul current balance is : -40
// sohan going to withdraul  current balance is : -30
// after withdraul current balance is : -50