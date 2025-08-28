class F{
    {
        System.out.println("initialisation block.......");
    }
    {
        System.out.println("initialisation block_2.......");
    }
     {
        System.out.println("initialisation block_3......");
    }

    
    
    F(int x){
    System.out.println("constructor....");
    }
    F(int x,int y){
        System.out.println("hey!!!");
    }
    F(){
        System.out.println("namaste...");
    }

    
    public static void main(String[] args) {
        F x=new F();
        
        F y=new F(7);
        F z=new F(4,8);
    }
}
