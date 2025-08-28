class F extends x3{
    public static void main(String[]args){
        F f=new F();
    }
}
class x3 extends x2{

}
class x2 extends x1{

}
class x1{
 x1 (){
    int y=12/0;
 }
}
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at x1.<init>(F.java:14)
//         at x2.<init>(F.java:9)
//         at x3.<init>(F.java:6)
//         at F.<init>(F.java:1)
//         at F.main(F.java:3)