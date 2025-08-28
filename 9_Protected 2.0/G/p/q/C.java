package p.q;




class C extends B{
    public static void main(String[]args){
    B p=new B();
    p.showinfo();
}

}
/*
 * 
C:\Users\sahuj\java coaching code\113\F - Copy>javac p/q/C.java
p\q\C.java:9: error: showinfo() has protected access in A
    p.showinfo();
     ^
1 error
 */