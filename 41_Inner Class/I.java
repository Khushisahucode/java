 class I {
   private int x=122;
   private void pro(){
       System.out.println("windows ultra pro information....."); 
       
    }
    class u{
      void show(){
        System.out.println("show some information of student.....");
        System.out.println(x);
        pro();
      }
    }
public static void main(String[] args) {
        I e=new I();
      u t=e.new u();
       t.show();
    }

}