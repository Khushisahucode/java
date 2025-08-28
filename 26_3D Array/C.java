public class C {
    public static void main(String[]args){
        int [][][] arr=new int [3][2][ 3];
        System.out.println("3-d array value before ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                   System.out.print(  arr[i][j][k] +" "); 
                }System.out.println();
            }System.out.println("~~~~~~~~~~~~~~~~~~~");
        };

      arr[0][0][0]=11;
      arr[0][0][1]=12;
      arr[0][0][2]=13;
      arr[0][1][0]=31;
      arr[0][1][1]=32;
      arr[0][1][2]=33;

      arr[1][0][0]=21;
      arr[1][0][1]=22;
      arr[1][0][2]=23;
       arr[1][1][0]=41;
       arr[1][1][1]=42;
       arr[1][1][2]=43;

    arr[2][0][0]=51;
    arr[2][0][1]=52;
    arr[2][0][2]=53;
    arr[2][1][0]=51;
    arr[2][1][1]=52;
    arr[2][1][2]=53;
    System.out.println("3-d array value after = ");
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            for (int k = 0; k < arr[i][j].length; k++) {
               System.out.print(  arr[i][j][k] +","); 
            }System.out.println();
        }System.out.println("~~~~~~~~~~~~~~~~~~~");
    }




   
      }/*
      3-d array value before
0 0 0
0 0 0
~~~~~~~~~~~~~~~~~~~
0 0 0
0 0 0
~~~~~~~~~~~~~~~~~~~
0 0 0
0 0 0
~~~~~~~~~~~~~~~~~~~
3-d array value after =
11,12,13,
31,32,33,
~~~~~~~~~~~~~~~~~~~
21,22,23,
41,42,43,
~~~~~~~~~~~~~~~~~~~
51,52,53,
51,52,53,
~~~~~~~~~~~~~~~~~~~
 */
  }





    
