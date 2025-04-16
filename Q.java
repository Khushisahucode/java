

import java.util.Scanner;
public class  Q {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number :");
   int a= sc.nextInt();
   int n=a;
   int rev=0;
   while(a>0){
     int digit = a%10;
  rev=rev*10+  digit ;
  a=a/10;
   
}
System.out.println("reverse  of number is :");
System.out.println(rev);
System.out.print(rev);

    
    if (n==rev){
        System.out.println("  number is palindrome");
    }else{
        System.out.println("   number is not palindrome ");
    }
}
}