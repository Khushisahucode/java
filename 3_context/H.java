public class H {
    static int x;
    static void show()
    {
        System.out.print("hello java");
    }
    public static void main(String[]args)
    
    {
        H.x=78;
        System.out.print(x);
        H.pro();
    }

    
    
    void pro()
    {
        System.out.print("instance context");
    }
}
/*
 * H.java:12: error: non-static method pro() cannot be referenced from a static context
        H.pro();
         ^
1 error
 */
