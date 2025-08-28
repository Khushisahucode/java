class P3{
   int y=900;
    void pro(){
       System.out.println("windows ultra pro information....."); 
       }
    class  u1 extends aa {
        int y=90;
        void show(){ int y=9;
        System.out.println(y);
        System.out.println(this.y);
         System.out.println(super.y);
          System.out.println(P3.this.y);}
    }
     public static void main(String[] args) {
        P3 e=new P3();
      u1 t=e.new u1();
       t.show(); }
} 

class aa{
    int y=9000;
}
// 9
// 90
// 9000
// 900