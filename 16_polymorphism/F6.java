public class F6{
    public static void main(String[] args) {
        spiderman a=new spiderman();
        shaktiman b=new shaktiman();
        inviteforlunch(a);
        inviteforlunch(b);
    }
    
    static void inviteforlunch(shaktiman x)
    {
        System.out.println("~~~~~~~~~~~");
        System.out.println("welcome");
        System.out.println("serve food");
    } 
}
/*
 * F6.java:5: error: incompatible types: spiderman cannot be converted to shaktiman
        inviteforlunch(a);
                       ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
 */