class B{
    public static void main(String[]args){
         char a='B';
         byte b=34;
         short c=89;
         int d=456;
         float e=7.8f;//narrow conversion
         double f=8.89;
         long g=899l;

        int []arr={a,b,c,d,e,f,g};
          for(int i:arr){
            System.out.println(i);
          }

    }
}/*
B.java:11: error: incompatible types: possible lossy conversion from float to int
        int []arr={a,b,c,d,e,f,g};
                           ^
B.java:11: error: incompatible types: possible lossy conversion from double to int
        int []arr={a,b,c,d,e,f,g};
                             ^
B.java:11: error: incompatible types: possible lossy conversion from long to int
        int []arr={a,b,c,d,e,f,g};
                               ^
3 errors

*/
