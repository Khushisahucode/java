 package p.q.r;
 //access through instanciaton
 class B {
    public static void main(String[]args){
        A a1=new A();
        a1.show();
        a1.pro();
    }
}
/*
 * p\q\r\B.java:6: error: show() has private access in A
        a1.show();
          ^
p\q\r\B.java:7: error: pro() has private access in A
        a1.pro();
          ^
2 errors
 */