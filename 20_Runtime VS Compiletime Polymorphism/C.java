//compiletime polymorphism
class C{
    static void pro(int a){
        System.out.println(a + ".....int.......");
    }
    //static void pro(float a){
       // System.out.println(a + ".......float.......");
    //}
    static void pro(double a){
        System.out.println(a + ".........double.......");
    }

 public static void main(String[]args){
      pro(9);
      pro(3.4f);
     pro(3.3);
      pro('w');

}
}