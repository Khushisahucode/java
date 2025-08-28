
class M1{
@Deprecated
static int x;
}
public class M {
    public static void main(String[] args) {
        System.out.println(M1.x); 
    }
}
// Note: M.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.
// 0