class D{  
    static int x=100;
    static class aa{
           void pro(){
              System.out.println(x);
           }
    }
    public static void main(String[]args){
        aa  nested=new aa();
         nested.pro();
    }
}