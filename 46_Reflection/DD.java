public class DD {
   static Class k;
   static Class k2;
    static Class pro(){
         class dd{

        }
        return dd.class;
   
    }

    DD(){
       class dd2{

       }
    }
         

    
    public static void main(String[] args) {
        System.out.println(k);
        k2=DD.pro();
        System.out.println(k2.getName());
    }
}
