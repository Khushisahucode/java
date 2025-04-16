import java.util.Scanner;
public class C {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value of x : ");
        int x=sc.nextInt();
        C c1=new C();
        c1.sum(x);
        sc.close();
    }
       
    
    
    void sum(int x){
    int digit;
        int digitsum=0;
        while(x>0)
        {
           digit =x%10;
           digitsum=digitsum+digit;
           x=x/10;
        }
        System.out.print("addition of digit : ");
        System.out.print(digitsum);
        
    
}
}