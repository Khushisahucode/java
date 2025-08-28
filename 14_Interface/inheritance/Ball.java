
//Family
class toy {
int price ;
String colour ;
}
//Quality
interface Jumpable {
    int x=4598;
}
public class Ball extends toy implements Jumpable {
    public static void main(String[]args){

    toy t1=new toy();
    t1.price= 3000;
   t1.colour = "Green";
     System.out.print("  toy's price are :");
     System.out.println(t1.price);
     System.out.print(" toy's colour :");
     System.out.println(t1.colour);
     System.out.print("value of x :");
     System.out.println(x);



    }
    

}
