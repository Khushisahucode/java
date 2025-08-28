 import java.util.Scanner;
public class H{
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
             }
             System.out.println("3-d array value after = ");
             for (int[][] i:arr) {
                 for (int j[] :i) {
                     for (int k :j) {
                        System.out.print(  k +","); 
                     }System.out.println();
                 }System.out.println("~~~~~~~~~~~~~~~~~~~");
             }
     }
}

