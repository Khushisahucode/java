public class J {
   final int x;

    public static void main(String[] args) {
       J c=new J();
       c. x=90;
    }
}

/*
 J.java:6: error: cannot assign a value to final variable x
       c. x=90;
        ^
1 error
*/
