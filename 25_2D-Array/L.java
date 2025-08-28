
import java.io.Console;
public class L {
    public static void main(String[] args) {
            String [][]x=new String [3][2];
            Console con=System.console();
            System.out.println("enter your array string value : ");
            for(int i=0;i<x.length;i++){
                for (int j=0;j<x[0].length;j++) {
                     x[i][j]=con.readLine();
               }
           }
           System.out.println("here is 2d array strings :");
           for(int i=0;i<x.length;i++){
         for (int j=0;j<x[0].length;j++) {
              System.out.print(x[i][j]+", ");
        }System.out.println("");
    }
}
}


