 class K {
    
  static void pro(){
       System.out.println("windows ultra pro information....."); 
       
    }
    class u{
        private static int w=122;
      private static  void show(){
        System.out.println("show some information of student.....");
       pro();
      }
    }
public static void main(String[] args) {
        K e=new K();
      u t=e.new u();
      System.out.println(u.w);
       u.show();
    }

}