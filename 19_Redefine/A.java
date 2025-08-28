class x1{
    int y=7;
}
class x2  extends x1{
    int y=50;
}
public class A extends x2{
    public static void main(String[] args) {
        x1 x=new x2();
        System.out.println("value of y");
        System.out.println(x.y);
    }
}//no dynamic method dismatch