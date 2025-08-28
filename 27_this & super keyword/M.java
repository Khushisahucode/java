public class M {
    int a=1111;
    class x1{
        int a=90;
        class x2{
            int a=30;
            void pro(){
                System.out.println(M.this.a);
            }
        }
    }
public static void main(String[] args) {
    M x=new M();
    M.x1 y= x.new x1();
    M.x1.x2 z=y.new x2();
    z.pro();
}
//output: 1111

}
