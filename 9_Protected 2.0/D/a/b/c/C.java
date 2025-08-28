 package a.b.c;
 class C extends A {
    public static void main(String[] args) {
      // Access through inheritance
      System.out.println("Access through inheritance : ");
       C c2=new C();//ok
       c2.showinfo();
       System.out.print("value of x :");
       System.out.println(c2.x);
      //Access through instanciation
      System.out.println("Access through instanciation  :");
      
        A c1=new A(); //ok
       c1.showinfo();
       System.out.print("value of x :");
       System.out.print(c1.x);
    }
    
}
