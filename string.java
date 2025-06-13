

public class string {
    public static void main(String[] args) {
        String str="khushisahu"; 
           
         for(int i=0; i<str.length();i++){
        
    
          int count = 1;
          for(int j=0;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j)&&i!=j){

                count++;
                
               }
            }
          
        
               System.out.println("count of letter "+str.charAt(i) + "  is : "+count);
        }
             }
            }
             
        
      
    
    


