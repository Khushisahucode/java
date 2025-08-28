import java.util.ArrayList;
@Deprecated
class X1 {
    @Deprecated
    static int y = 90;
}
class X {
   // @SuppressWarnings("unchecked")
    @SuppressWarnings({"deprecation","unchecked"})
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        W1 x;
  ArrayList y = new ArrayList();
 y.add(23);
 System.out.println(W1.y);
    }
}
//90