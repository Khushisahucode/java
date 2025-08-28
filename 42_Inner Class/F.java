

class F{  
    static int x=100;
    static class b1{
         static class b2{
            static class b3{ 
                 static class b4{
                       static void pro(){
              System.out.println(x);
           }
        } }
         }
        
    }
    public static void main(String[]args){
        b1.b2.b3.b4  nested= new b1.b2.b3.b4();
        nested.pro();
        
    }
}