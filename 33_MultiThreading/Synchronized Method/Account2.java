class Account2 {
    int balance;
    String acnum;
    String actype;
    Account2(int balance,String acnum,String actype){
        this.balance=balance;
        this.acnum=acnum;
        this.actype=actype;
}
    void withdraul(int amount){
        if(getbalance()>=amount)
        
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