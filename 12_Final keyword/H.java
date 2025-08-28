public class H {
    final int x;
    final int z;
    int p;
   public static void main(String[] args) {
   H m=new H();
   System.out.println(m.p);
   System.out.print(m.x);
   System.out.print(m.z);
    
    
      
    
    }
    
}
/*  error: variable x might not have been initialized
System.out.println(x);
^
1 error
              ^
H.java:3: error: variable z not initialized in the default constructor
    final int z;
              ^
2 errors

*/