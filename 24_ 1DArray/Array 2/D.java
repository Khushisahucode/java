
class D{
    public static void main(String[]args){
         char a='B';
         byte b=34;
         short c=89;//widely conversion
         int d=456;
         boolean e=false;
        
        int []arr={a,b,c,d,e};
          for(int i:arr){
            System.out.println(i);
          }

    }
}
/*
 * D.java:10: error: incompatible types: boolean cannot be converted to int
        int []arr={a,b,c,d,e};
                           ^
1 error

 */