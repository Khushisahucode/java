class y{
    
    y(){
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

public class H  extends y{
    {
        System.out.println("C");
    }
    static {
        System.out.println("X");
    }
    H(){
        System.out.println("M");
    }
    public static void main(String[] args) {
        System.out.println("main start ");
        H h=new H();
        System.out.println("main end");
   
   
    }
    
}
