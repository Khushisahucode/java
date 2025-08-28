public class J {
         public static void main(String[]args){
          int [][]x={{12,23,45,56},{5,7,9},{3,14}};
          int [][]y=new int[x.length][];
          y[0]=new int[x[0].length];
          y[1]=new int[x[1].length];
          y[2]=new int[x[2].length];
          for (int i = 0; i < y.length; i++) {
           for (int j = 0; j < y[i].length; j++) {
                y[i] [j]=x[i][j];
           }System.out.println();
       }
       System.out.println("2-D Array elements are :");
       for (int i = y.length-1; i >=0 ;i--) {
              for (int j = 0; j < y[i].length; j++) {
                  System.out.print(  y[i][j]+" ");
              }System.out.println();
          }
        }
}/*  2-D Array elements are :
3 14 
5 7 9
12 23 45 56 

    
*/
