public class G {
    static int x;
    public static void main(String[]args)
    {  
        x=343;
      pro();
      System.out.println("");
       System.out.print(x);
    }
   static void pro()
    {
        System.out.print("instance context");
    }
}
