
    import java.util.Scanner;
   class G{
    public static void main(String[]args){
   Scanner sc =new Scanner(System.in);
   System.out.print("enter the value of a :");
      int a= sc.nextInt();
      System.out.print("enter the value of b :");
      int b=sc.nextInt();
      System.out.print("enter value of x :");
      int x=sc.nextInt();
  switch(x){
    case 1:
   System.out.print("addition is : ");
    System.out.println(a+b);
   case 2 :
   System.out.print("product is :");
   System.err.println(a*b);
    case  3:
 System.out.print("modulo is :");
  System.out.println(a%b);
   case  4:
  System.out.print("division is :" );
   System.out.println(a/b);
    
   case 5:
    System.out.print("substraction is :");
   System.out.println(a-b);
   default:
   System.out.println("there are no one operations ");


  }
  sc.close();
}
}






