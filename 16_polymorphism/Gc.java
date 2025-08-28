public class Gc {
    public static void main(String[]args){
        vehicle x=new  bus();
        if(x instanceof fourwheler ){
         System.out.println("fourwheler IS-A bus");
        }
       else{
         System.out.print("fourwheler  is not A bus ");
       }
    
     }
}
