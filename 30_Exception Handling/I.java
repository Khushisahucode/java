public class I {
    public static void main(String[]args){
       try{
        int x=12/0;
    }catch(ArithmeticException e){

        System.out.println(e);

        }
    
       System.out.println("start ");
       
         System.out.println("end ");
    }
}
// java.lang.ArithmeticException: / by zero
// start 
// end 
