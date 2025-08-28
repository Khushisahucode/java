
    class x8  {
        animal  pro(){
        System.out.println("hello ");
       
        return null;
        }
        
    }
    public class L1 extends x8{
        public static void main(String[] args){
    L1 lx=new L1();
    lx.pro();
    
    
        }
    cat pro()
        {
    System.out.println("hii");
    
    return  null;
        }
    }
    /*
     * l1.java:17: error: pro() in L1 cannot override pro() in x8
    cat pro()
        ^
  return type cat is not compatible with animal
1 error

     */

