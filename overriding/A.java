 class x{
    void pro(){
        System.out.println("hello");
    }
}
class A extends x{
 void pro(){
        System.out.println("namaskaram");
  }
    public static void main(String[] args) {
        A x=new A();
        x.pro();
        x.pro();
    }
}