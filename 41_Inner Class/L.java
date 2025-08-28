 class L {
    private static int y=90;
   private static void pro(){
       System.out.println("windows ultra pro information....."); 
       
    }
    class u{
        private static int w=122;
      private static  void show(){
        System.out.println("show some information of student.....");
       pro();
       System.out.println(y);
      }
    }
public static void main(String[] args) {
        L e=new L();
      u t=e.new u();
      System.out.println(u.w);
       u.show();
    }

}