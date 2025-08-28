class E{
    {
        System.out.println("initialisation block.......");
    }
    E(int x){
    System.out.println("constructor....");
    }
    E(int x,int y){
        System.out.println("hey!!!");
    }
    E(){
        System.err.println("namaste...");
    }

    
    public static void main(String[] args) {
        E x=new E();
        
        E y=new E(7);
        E z=new E(3,9);

    }
}