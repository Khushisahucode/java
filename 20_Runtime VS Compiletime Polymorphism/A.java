//compiletime polymorphism
class A{
    static void pro(int a){
        System.out.println(a);
    }
    static void pro(float a){
        System.out.println(a);
    }
 public static void main(String[]args){
      pro(9);
      pro(3.4f);
    // pro(3.3);
      pro('w');

}
}
