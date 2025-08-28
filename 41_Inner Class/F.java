
 class F1 {
    int x=12232;
    void pro(){
       System.out.println("some pro information....."); 
    }
    class u{
      void show(){
        System.out.println("namaskar");
      }
    }
}
    class F{
    public static void main(String[] args) {
        F1 e=new F1();
       F1 .u t=e.new u();
       t.show();
    }
}
