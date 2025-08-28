

class H{  
    static int x=10;
    static class b1{static int x=20;
         static class b2{static int x=30;
            static class b3{ static int x=40;
                 static class b4{static int x=50;
                       static void pro(){ int x=60;
              System.out.println(x);
              System.out.println(b4.x);
              System.out.println(b3.x);
              System.out.println(b2.x);
              System.out.println(b1.x);
              System.out.println(H.x);

      

           }
        } }
         }}
    public static void main(String[]args){
        b1.b2.b3.b4  nested= new b1.b2.b3.b4();
        nested.pro();
        
    }
}