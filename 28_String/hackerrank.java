import java.util.Scanner;
class hackerrank{
  public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter value of t = ");
          int t= in.nextInt();
          System.out.println("enter integer = ");
            for(int i=0;i<t;i++){
            System.out.println("enter the value of a b and n");
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sn=a;
            System.out.println("series are : "); 
          for(int j=0;j<n;j++)
          {  
            sn += Math.pow(2,j)*b;
            System.out.print(sn + " " );
            }
            System.out.println();}
           in.close();
            }};
// output :     
// enter value of t = 3
// enter integer = 
// enter the value of a b and n
// 2
// 0
// 0
// series are : 

// enter the value of a b and n
// 0
// 2
// 10
// series are :
// 2 6 14 30 62 126 254 510 1022 2046
// enter the value of a b and n
// 5
// 3
// 5
// series are :
// 8 14 26 50 98