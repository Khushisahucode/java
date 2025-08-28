
import java.util.Scanner;
public class G{
    public static void main(String[]args){
            int [][][] arr=new int [3][2][ 3];
            Scanner sc=new Scanner(System.in);
            System.out.println(" Enter 3-d array value before ");
            for (int[][] i:arr) {
                for (int j[] :i) {
                    for (int k :j) {
                         k =sc.nextInt(); 
                    }System.out.println();
                }System.out.println("~~~~~~~~~~~~~~~~~~~");
            }
            System.out.println("3-d array value after = ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                   System.out.print(  arr[i][j][k] +","); 
                }System.out.println();
            }System.out.println("~~~~~~~~~~~~~~~~~~~");
        }
     }
          }//no input 
/*
 *  Enter 3-d array value before
12
343
54

5
65
676

~~~~~~~~~~~~~~~~~~~
7
67
6


8788

989
9

~~~~~~~~~~~~~~~~~~~

989
8
89


98
899
89

~~~~~~~~~~~~~~~~~~~
3-d array value after =
0,0,0,
0,0,0,
~~~~~~~~~~~~~~~~~~~
0,0,0,
0,0,0,
~~~~~~~~~~~~~~~~~~~
0,0,0,
0,0,0,
~~~~~~~~~~~~~~~~~~~
 */
