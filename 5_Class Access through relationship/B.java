public class B {
    public static void main(String[]args){
     B1 x=new B1();// Access through instanciation
     x.y=45;
     System.out.print("value of y :");
     System.out.print(x.y);
    }
}class B1{
    int y;
}
