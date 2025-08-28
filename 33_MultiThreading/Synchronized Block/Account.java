class Account {
   private int balance;
    String acnum;
    String actype;
    Account(int balance,String acnum,String actype){
        this.balance=balance;
        this.acnum=acnum;
        this.actype=actype;
}
   /* public synchronized*/ void withdraul(int amount){
        Thread x=Thread.currentThread();
        synchronized (this){
       if(getbalance()>=amount){
         try{ x.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
         balance = balance - amount;}
     }
}
     int  getbalance(){
       return balance;
    }
    String getacnum(){
        return acnum;
    }
    String getactype(){
        return actype;
    }
}
// sohan going to withdraul  current balance is : 50
// mohan going to withdraul  current balance is : 50
// sohan going to withdraul  current balance is : 40
// mohan going to withdraul  current balance is : 30
// sohan going to withdraul  current balance is : 20
// mohan going to withdraul  current balance is : 10
// mohan going to withdraul  current balance is : 0
// mohan going to withdraul  current balance is : 0
// sohan going to withdraul  current balance is : 0
// sohan going to withdraul  current balance is : 0
// after withdraul current balance is : 0
// after withdraul current balance is : 0
