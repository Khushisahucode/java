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
     pro(3.3);
      pro('w');

}
}
/*
 * B.java:12: error: no suitable method found for pro(double)
     pro(3.3);
     ^
    method A.pro(int) is not applicable
      (argument mismatch; possible lossy conversion from double to int)
    method A.pro(float) is not applicable
      (argument mismatch; possible lossy conversion from double to float)
1 error

 */