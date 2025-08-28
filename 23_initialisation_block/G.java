class G{
    {
        System.out.println("initialisation block.......");
    }
    static {
        System.out.println("  static initialisation block_1.......");
    }
     static {
        System.out.println(" static initialisation block_2......");
    }

    
    
    G(int x){
    System.out.println("constructor....");
    }
    G(int x,int y){
        System.out.println("hey!!!");
    }
    G(){
        System.out.println("namaste...");
    }

    
    public static void main(String[] args) {
        System.err.println("main start.........");
        G x=new G();
        
        G y=new G(7);
        G z=new G(4,8);
        System.err.println("main end........");
    }
}

