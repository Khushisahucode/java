class t1{
    void info(){
  System.out.println("hello.....");
    }
}
class t2 extends t1{
    void info(){
   System.out.println("hey.......");
    }
}


public class T {
    public static void main(String[] args) {
        t1 x=new t2();
        x.info();
    }
}
