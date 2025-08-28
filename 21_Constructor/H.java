public class H {
    H(int x){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        H x=new H();

    }
}
/*
 * H.java:6: error: constructor H in class H cannot be applied to given types;
        H x=new H();
            ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error
 */