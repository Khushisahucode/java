class matrix{

public static void main(String[]args){

    int[] []A={{2,3},{5,6}};
    int[] []B={{3,1},{3,2}};
    int [][]C=new int [A.length][B[0].length];
      


    for (int i = 0; i < A.length; i++) {
        
        for (int j = 0; j < B[0].length; j++) {
           for(int k=0;k<A.length;k++){
            C[i][j]+=A[i][k]*B[k][j];
        }
            }    
          System.out.println("");
        }  
        System.out.println("product matrix is = ");
        
        for (int i = 0; i < A.length; i++) {
        
            for (int j = 0; j < B[0].length; j++) {
               
             System.out.print(   C[i][j] +" ");
        
            
                }    
              System.out.println("");
            }
        }
    }
// product matrix is =
// 15 8 
// 33 17

