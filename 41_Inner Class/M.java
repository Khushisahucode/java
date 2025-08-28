class M {
    int y=90;
    void pro(){
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
        M e=new M();
      u t=e.new u();
      System.out.println(u.w);
       u.show();
    }

}
// M.java:11: error: non-static method pro() cannot be referenced from a static context
//        pro();
//        ^
// M.java:12: error: non-static variable y cannot be referenced from a static context
//        System.out.println(y);
//                           ^
// 2 errors