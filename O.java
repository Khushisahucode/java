
import java.util.Scanner;
public class  O {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number :");
   int n= sc.nextInt();
   for (int i=0;i<=n;i++){
    for (int j=n;j>=i;j--){
        System.out.print("3");
    }
    System.out.println("");
   }

    }
}