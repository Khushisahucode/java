class D{
    {
        System.out.println("hello....");

    }
    D(){
    System.err.println("namaste....");
    }
    public static void main(String[]args){
        System.err.println("start main...");
        D x=new D();
        System.err.println("end main....");
    }
}