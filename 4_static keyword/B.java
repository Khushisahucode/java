 class B {
    static int x=99;
    public static void main(String[] args) {
        B a=new B();
        x=999;
         B b=new B();
        x=99999;
        B c=new B();
        x=900;
        c.show();
        a.show();
        b.show();
    }
    void show()
    {    System.out.print("value of x is =  ");
        System.out.println(x);
    }

}
