class A{
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
       

       }catch(StringIndexOutOfBoundsException e){
        System.out.println(e);
        System.out.println("SIOB");
       }
        catch(IndexOutOfBoundsException e){
        System.out.println(e);
        System.out.println("IOBE");
       }
       catch(NumberFormatException  e){
        System.out.println(e);
        System.out.println("NFE");
       }finally{
        System.out.println("essential code");
       }System.out.println("Z");
    }
}
// PS C:\Users\sahuj\java coaching code\31_Exception Handling> java A 
// A
// java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
// IOBE
// essential code
// Z
// PS C:\Users\sahuj\java coaching code\31_Exception Handling> java A 0
// A
// B
// 12
// o
// C
// essential code
// Z
// PS C:\Users\sahuj\java coaching code\31_Exception Handling> java A 1
// A
// B
// 45
// m
// C
// essential code
// Z
// PS C:\Users\sahuj\java coaching code\31_Exception Handling> java A 2
// A
// B
// 67
// java.lang.StringIndexOutOfBoundsException: Index 2 out of bounds for length 2
// SIOB
// essential code
// Z
// PS C:\Users\sahuj\java coaching code\31_Exception Handling> java A 3
// A
// B
// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
// IOBE
// essential code
// Z
// PS C:\Users\sahuj\java coaching code\31_Exception Handling> java A om
// A
// java.lang.NumberFormatException: For input string: "om"
// NFE
// essential code
// Z