
class y1{
    
    y1(){
        System.out.println("U");
    }
    
    
    {
        System.out.println("A ");
    }
    {
        System.out.println("B");
    }
    static {
        System.out.println("V");
    }
}

public class I /*extends*/ {
    {
        System.out.println("C");
    }
    static {
        System.out.println("X");
    }
    I(){
        System.out.println("M");
    }
    public static void main(String[] args) {
        System.out.println("main start ");
        y1 x=new y1();
        System.out.println("main end");
   
   
    }
    
}
