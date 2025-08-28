public class B {
    
    public static void main(String[]args){
        System.out.println("A");
       try{
        int i=Integer.parseInt(args[0]);
         System.out.println("B");
        int y[]={12,45,67};
        System.out.println(y[i]);
        String s="om";
        System.out.println(s.charAt(i));
        
        System.out.println("C");
       

       }catch(IndexOutOfBoundsException e){
        System.out.println(e);
        System.out.println("IOBE");
       }
       catch(StringIndexOutOfBoundsException e){
        System.out.println(e);
        System.out.println("SIOB");
       }
       
       catch(NumberFormatException  e){
        System.out.println(e);
        System.out.println("NFE");
       }finally{
        System.out.println("essential code");
       }System.out.println("Z");
    }
}
// B.java:20: error: exception StringIndexOutOfBoundsException has already been caught
//        catch(StringIndexOutOfBoundsException e){
//        ^
// 1 error