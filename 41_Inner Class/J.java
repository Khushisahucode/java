 class J {
    
   void pro(){
       System.out.println("windows ultra pro information....."); 
       
    }
    class u{
        private int w=122;
      private void show(){
        System.out.println("show some information of student.....");
       
      }
    }
public static void main(String[] args) {
        J e=new J();
      u t=e.new u();
      System.out.println(t.w);
       t.show();
    }

}