class Account {
    int balance;
    String acnum;
    String actype;
    Account(int balance,String acnum,String actype){
        this.balance=balance;
        this.acnum=acnum;
        this.actype=actype;
}
    void withdraul(int amount){
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