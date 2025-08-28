public class H {
    public static void main(String[] args) {
        int [] x={};
        int [][]y={};
       int [][][]z={};
       System.out.println(x instanceof int[]);
       System.out.println(x instanceof int[][]);
       System.out.println(x instanceof int[][][]);
   
       System.out.println(y instanceof int[]);
       System.out.println(y instanceof int[][]);
       System.out.println(y instanceof int[][][]);
   
       System.out.println(z instanceof int[]);
       System.out.println(z instanceof int[][]);
       System.out.println(z instanceof int[][][]);
   
   
   
   
    }
}
/*
 * H.java:7: error: incompatible types: int[] cannot be converted to int[][]
       System.out.println(x instanceof int[][]);
                          ^
H.java:8: error: incompatible types: int[] cannot be converted to int[][][]
       System.out.println(x instanceof int[][][]);
                          ^
H.java:10: error: incompatible types: int[][] cannot be converted to int[]
       System.out.println(y instanceof int[]);
                          ^
H.java:12: error: incompatible types: int[][] cannot be converted to int[][][]
       System.out.println(y instanceof int[][][]);
                          ^
H.java:14: error: incompatible types: int[][][] cannot be converted to int[]
       System.out.println(z instanceof int[]);
                          ^
H.java:15: error: incompatible types: int[][][] cannot be converted to int[][]
       System.out.println(z instanceof int[][]);
                          ^
6 errors
 */