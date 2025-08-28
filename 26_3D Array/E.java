
import java.util.Scanner;
public class E {
    public static void main(String[]args){
            int [][][] arr=new int [3][2][ 3];
            Scanner sc=new Scanner(System.in);
            System.out.println(" Enter 3-d array value before ");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    for (int k = 0; k < arr[i][j].length; k++) {
                         arr[i][j][k]=sc.nextInt();
                    }
                }System.out.println("~~~~~~~~~~~~~~~~~~~");
            };
         System.out.println("3-d array value after = ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                   System.out.print(  arr[i][j][k] +","); 
                }System.out.println();
            }System.out.println("~~~~~~~~~~~~~~~~~~~");
        }
    
    
    
    
       
          }
          
      }
      /*
       *  Enter 3-d array value before
12
34
45
656
7
67
~~~~~~~~~~~~~~~~~~~

78
676
6

5
87
9
~~~~~~~~~~~~~~~~~~~
89
78
9
9

7970
7
~~~~~~~~~~~~~~~~~~~
3-d array value after =
12,34,45,
656,7,67,
~~~~~~~~~~~~~~~~~~~
78,676,6,
5,87,9,
~~~~~~~~~~~~~~~~~~~
89,78,9,
9,7970,7,
~~~~~~~~~~~~~~~~~~~

       */
    

    
    
    
        
    
