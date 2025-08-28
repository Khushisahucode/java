class golu {  }
public class Y {
    public static void main(String[] args) {
        try{
        Class k1=Class.forName("golu");
         Class k2=Class.forName("Y");
        System.out.println(k1);
         System.out.println(k2);}catch(ClassNotFoundException e){
         e.printStackTrace();
         }
        
    }
}
//class golu
//class Y