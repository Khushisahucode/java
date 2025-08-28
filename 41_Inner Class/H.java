 class H {
    int x=122;
    void pro(){
       System.out.println("windows ultra pro information....."); 
       
    }
    class u{
      static void show(){
        System.out.println("show some information of student.....");
       // pro(); not ok
        
      }
    }
public static void main(String[] args) {
        H e=new H();
      u t=e.new u();
       u.show();
    }

}