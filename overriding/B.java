class x1{
void pro(){
System.out.println("hello");

}
}
public class B extends x1{
public static void main(String[]args){
   B x= new B();
   x.pro();
   x.pro(5);
}
void pro(int x){
System.out.println("namaskaram");
}

}