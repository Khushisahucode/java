import java.util.Scanner;
public class K {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to cheack = ");
        int x= sc.nextInt();
        K b1=new k();
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
