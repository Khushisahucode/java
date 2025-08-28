class x11{
   static int z=78;
}
class x12  extends x11{
   static  int z=500;
}
public class B extends x12{
    public static void main(String[] args) {
        x11 x=new x12();
        System.out.println("value of z");
        System.out.println(x.z);
        //x11.z
    }
}
    

