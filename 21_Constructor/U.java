class u1{
    void info(){
        
  System.out.println("hello.....");
    }
}
class u2 extends u1{
    void info(){

        super.info();
   System.out.println("hey.......");
    }
}


public class U {
    public static void main(String[] args) {
        u1 x=new u2();
        
        x.info();
    }
}
