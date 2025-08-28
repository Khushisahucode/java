public class E {
    public static void main(String[] args) {
        D x=new D();
        x.add();
        E y=new E();
        y.add();
     }
     final  void add()
     {
         int x=89;int y=67;
         System.out.print("Addition is = ");
         System.out.println(x+y);
     }
 
 }
 class D extends E
 {
 void add()
 {
     System.out.println("hello khushi");
 }
}
/*E.java:18: error: add() in D cannot override add() in E
 void add()
 ^
overridden method is final
1 error*/
