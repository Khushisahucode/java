class J{  
     static int x=100;
    static class aa2{
           static void pro(){
              System.out.println(x);
           }
    }}
    class xxx{
    public static void main(String[]args){
      //  aa2 nested=new aa2();//not ok
       J.aa2  nested=new J.aa2();//ok
        nested.pro();
        
    }
}