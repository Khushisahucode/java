import java.util.Scanner;
public class B {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to cheack = ");
        int x= sc.nextInt();
        B b1=new B();
        b1.cheackprime(x);
        sc.close();
    }
    
        
    


void cheackprime(int x)
{
   
int j=2;
    
    
        for(;j<=x; j++)
        {   
           if(x%j==0){
           
           }
           break;
        }

    if(j== x ){
   System.out.print("number  is prime");
    }
    else{
        System.out.print("number not is prime");
    }
    }
}
