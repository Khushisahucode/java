class C{
    public static void main(String[]args){
         char a='B';
         byte b=34;
         short c=89;
         int d=456;
         float e= 7.8f;//narrow conversion
         double f= 8.89;
         long g= 899l;

        int []arr={a,b,c,d,(int)e,(int)f,(int)g};
          for(int i:arr){
            System.out.println(i);
          }

    }
}/*//explicitly narrowing conversion
66
34
89
456
7  --->truncation
8  --->truncation
899 --->truncation
*/
