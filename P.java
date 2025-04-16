
import java.util.Scanner;
public class  P {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number :");
   int a= sc.nextInt();
   int sum=0;
   while(a>0){
  sum=sum+a%10;
  a=a/10;
   
}
System.out.print("sum of digit is :");
System.out.println(sum);
    }
}
