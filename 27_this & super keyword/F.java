class x{
    int x=90;
}

public class F extends x {
    
     void pro(){
        System.out.println("value of x = "+x);
    }
      
           public static void main(String[]args){
           F x=new F();
          x.pro();
     }
}
// value of x = 90
