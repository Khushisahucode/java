public class C {
    public static void main(String[] args) {
        account a=new account();
        a.balance =1000;
        account b=new account();
        b.balance =2000;
        System.out.println(a+b);
    }
}
class account{
    int balance;
}
/*
 * C.java:7: error: bad operand types for binary operator '+'
        System.out.println(a+b);
                            ^
  first type:  account
  second type: account
1 error
 */