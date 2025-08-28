class Account4 {
   private int balance;
    String acnum;
    String actype;
    Account4(int balance,String acnum,String actype){
        this.balance=balance;
        this.acnum=acnum;
        this.actype=actype;
}
     public synchronized void withdraul(int amount){
        Thread x=Thread.currentThread();
      //  if(getbalance()>=amount)
        // try{ x.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
         balance = balance - amount;
    }
      public synchronized int  getbalance(){
       return balance;
    }
    String getacnum(){
        return acnum;
    }
    String getactype(){
        return actype;
    }
}
// mohan going to withdraul  current balance is : 30
// sohan going to withdraul  current balance is : 20
// mohan going to withdraul  current balance is : 10
// mohan going to withdraul  current balance is : 0
// mohan going to withdraul  current balance is : 0
// sohan going to withdraul  current balance is : 0
// sohan going to withdraul  current balance is : 0
// after withdraul current balance is : 0
// after withdraul current balance is : 0