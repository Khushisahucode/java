public class S {
    static int count = 0;
    public static void main(String[] args) {
        
        System.out.println("A");
        try{
            pro();
        }catch(Exception e){
System.out.println(e);
        }finally {
            System.out.println("essential code");
        }System.out.println("Z");
    }
    static void pro(){
        System.out.println(count++);
        pro();
    }
 }
//stack overflowError