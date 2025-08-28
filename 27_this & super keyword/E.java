public class E {
    
    
        void pro(){
        System.out.println(this);
    }
       
        {
            System.out.println(this);
        }
        E(){
            
            System.out.println(this);
        }
    
    
        public static void main(String[]args){
           E x=new E();
           System.out.println("start main.........");
           System.out.println("End main.........");
    
       
        }
}
// E@372f7a8d
// E@372f7a8d
// start main.........
// End main.........