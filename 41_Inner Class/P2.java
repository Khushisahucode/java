class P2{
   int y=90;
    void pro(){
       System.out.println("windows ultra pro information....."); 
       
    }
    class  u1 extends aa {
        // int y=900;
        void show(){ 
        System.out.println(y);
        }
    }
     
        
public static void main(String[] args) {
        P2 e=new P2();
      u1 t=e.new u1();

       t.show();
    }
} 

class aa{
    int y=9;
}
//9