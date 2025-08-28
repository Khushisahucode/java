class Account3 {
    int balance;
    String acnum;
    String actype;
    Account3(int balance,String acnum,String actype){
        this.balance=balance;
        this.acnum=acnum;
        this.actype=actype;
}
      void withdraul(int amount){
        Thread x=Thread.currentThread();
        if(getbalance()>=amount)
        try{
         x.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}

balance = balance - amount;
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
