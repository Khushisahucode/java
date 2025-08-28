public class X1 {
    public static void main(String[] args) {
        System.out.println("A");
        System.out.println(pro());
        System.out.println("B");
    }
    static int pro(){
        try{
        System.out.println("X");
      return 44;
    }
        finally{
            System.out.println("Y");
         return 99;
        }
    }
}
// A
// X
// Y
// 99
// B