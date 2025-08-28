class A{
    public static void main(String[]args){
         char a='B';
         byte b=34;
         short c=89;//widely conversion
         int d=456;
        
        int []arr={a,b,c,d};
          for(int i:arr){
            System.out.println(i);
          }

    }
}
/*
 * 66
34
89
456
 */