public class N {
    int x = 90;
    {
        System.out.println("hello");
        System.out.println(x);
    }
    N(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        N x=new N();
    }
}
