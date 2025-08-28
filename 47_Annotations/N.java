class N1{
@Deprecated
static int x;
}
public class N {
    @Deprecated
    static int y;
    public static void main(String[] args) {
        System.out.println(N1.x); 
    System.out.println(y);
    }
}
// Note: N.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.
// 0
// 0