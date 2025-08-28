public class C {
     public static void main(String[]args){
        System.out.println("A");
       try{
        int i=Integer.parseInt(args[0]);
         System.out.println("B");
        int y[]={2,0,4};
        String s="om";
        System.out.println(s.charAt(i));
        
        System.out.println("C");
        int z=12/y[i];

       } catch(IndexOutOfBoundsException e){
        System.out.println(e);
        System.out.println("AIOBE");
       }

       catch(StringIndexOutOfBoundsException e){
        System.out.println(e);
        System.out.println("SIOB");
       }
        catch(ArithmeticException e){
        System.out.println(e);
        System.out.println("AE");
       }finally{
        System.out.println("essential code");
       }System.out.println("Z");
    }
}
// C.java:19: error: exception StringIndexOutOfBoundsException has already been caught
//        catch(StringIndexOutOfBoundsException e){
//        ^
// 1 error