
    class x112  {
        animal  pro(){
        System.out.println("hello ");
       
        return null;
        }
        
    }
    public class L2 extends x112{
        public static void main(String[] args){
         L2 lx=new L2();
    lx.pro();
    
    
        }
        livingbeing  pro()
        {
    System.out.println("hii");
    return  null;
        }
}
/*
 * M.java:17: error: pro() in M cannot override pro() in x112
        livingbeing  pro()
                     ^
  return type livingbeing is not compatible with animal
1 error
 */
