class N{
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
        N e=new N();
      u1 t=e.new u1();
      System.out.println(t.w);//ok
       t.show();//ok
        System.out.println(e.w);//not ok
       e.show(); // not ok
    }

}
// N.java:18: error: cannot find symbol
//         System.out.println(e.w);
//                             ^
//   symbol:   variable w
//   location: variable e of type N
// N.java:19: error: cannot find symbol
//        e.show();
//         ^
//   symbol:   method show()
//   location: variable e of type N
// 2 errors