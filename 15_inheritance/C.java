
class x1{
    void pro(){
        System.out.println("hello");
    }

}
public class C extends x1 {
    public static void main(String[] args) {
       
    
    C x=new C();
    System.out.println(x.hashCode());
    System.out.println(x.toString());
    x.pro();
}
}
