//runtime polymorphism
//dynamic method dispatch
import java.util.Scanner;
class x1{
    void pro(){
      System.out.println("......hello from x1.....");
    }
    
    }
    class x2 extends x1{
        void pro(){
            System.out.println(".......hey from x2....");
          }
    }
    class x3 extends x2{
        void pro(){
            System.out.println("........namaste from x3....");
          }
    }
    
    
    
    public class E {
        public static void main(String[] args) {
    x1  x=null;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n :");
        int n=sc.nextInt();
        if(n==1){
            x= new x2();
        }else{
            x= new x3();
        }
             x.pro();
    
        }
        
    }
