class Q1{
   static  int pro(){
     @Deprecated
     int x=90;
   System.out.println(x);
    return x;
}

}
public class Q {
    public static void main(String[] args) {
        int pro=Q1.pro();
        System.out.println(pro);
    }
}
//90
//90