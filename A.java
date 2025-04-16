
import java.util.Scanner;


public class A

{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
      System.out.print("enter value 1 = ");
      int x = Sc.nextInt();
      System.out.print("enter value 2 = ");
      int y= Sc.nextInt();
      System.out.print("addition of x  and  y is = ");
      A p=new A();
     System.out.print( p.add(x,y));
 Sc.close();

    }
    public int add(int x,int y)
    {
      //System.out.print(x+y);
  return x+y ; }
}



