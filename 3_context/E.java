public class E {
    int x;
    public static void main(String[]args)
    {
       pro();
       System.out.print(x);
    }
    void pro()
    {
        System.out.print("instance context");
    }
}
/*
 * E.java:5: error: non-static method pro() cannot be referenced from a static context
       pro();
       ^
E.java:6: error: non-static variable x cannot be referenced from a static context
       System.out.print(x);
                        ^
2 errors

 */