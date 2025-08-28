interface  A{

}


public class R {
    public static void main(String[] args) {
        A x;
        System.out.println(x);
    }
    
}
/*R.java:9: error: variable x might not have been initialized
System.out.println(x);
                   ^
1 error
 */