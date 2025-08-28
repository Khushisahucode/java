class YThread implements  Runnable{
    public void run(){
        Thread x=Thread.currentThread();
         
        for (int i = 0; i < 5; i++) {
            System.out.println(x.getName()+" going to withdraul  current balance is : "+ D.ac.getbalance());
             if(D.ac .getbalance()>=10){
            try{ x.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
            D.ac.withdraul(10);}
            System.out.println("after withdraul current balance is : "+ D.ac.getbalance());
        }
    }
}
public class D {
    static Account4 ac=new Account4(50,"454646","saving");
    public static void main(String[] args) {
        YThread r=new YThread();
        Thread t1= new Thread(r,"mohan");
         Thread t2= new Thread(r,"sohan");
         t1.start();
         t2.start(); }
}
//sohan going to withdraul  current balance is : 50
//mohan going to withdraul  current balance is : 50
//after withdraul current balance is : 40
// mohan going to withdraul  current balance is : 30
// after withdraul current balance is : 30
// sohan going to withdraul  current balance is : 30
// after withdraul current balance is : 20
// mohan going to withdraul  current balance is : 20
// after withdraul current balance is : 10
// sohan going to withdraul  current balance is : 10
// after withdraul current balance is : 0
// mohan going to withdraul  current balance is : 0
// after withdraul current balance is : 0
// mohan going to withdraul  current balance is : 0
// after withdraul current balance is : 0
// after withdraul current balance is : -10
// sohan going to withdraul  current balance is : -10
// after withdraul current balance is : -10
// sohan going to withdraul  current balance is : -10
// after withdraul current balance is : -10