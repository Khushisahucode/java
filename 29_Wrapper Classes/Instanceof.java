class Instanceof{
  static int x;
  static String y;
    public static void main(String[]args){
    
      
        student z =new student();
        System.out.println(x);
        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toString()" because "Instanceof.y" is null
        // at Instanceof.main(Instanceof.java:9)
    System.out.println(y.toString());  //return type string
    System.out.println(z);
    }
}
// 0
// student@2f92e0f4