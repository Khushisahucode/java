 class G {
    int x=122;
    void pro(){
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
        G e=new G();
      u t=e.new u();
      t.show();
    }

}