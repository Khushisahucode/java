class O{
    int y=90;
    void pro(){
       System.out.println("windows ultra pro information....."); 
       
    }
    class u1{
         int w=122;
        void show(){
        System.out.println("show some information of student.....");
        }
    }
public static void main(String[] args) {
        O e=new O();
      u1 t=e.new u1();
      System.out.println(t.y);//not ok
       t.pro();//not ok
        System.out.println(e.y);//ok
       e.pro();//ok
    }

}