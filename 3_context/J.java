public class J {
  static   int x=34;
   static void show()
    {
        System.out.print("hello java");
    }
    void pro()
    {
        System.out.println(x);//instance variable
        J.show();//static method
    }
    public static void main(String[]args)
    {
        J s=new J();
        s.pro();

    }

}
