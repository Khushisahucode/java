public class aa {
    public static void main(String[] args) {
        int a=100_00;
        int b=10_0;
        int c=1_0;
        int d=_10;
        System.out.println(a+b+c+d);
    }
}
/*
 * aa.java:6: error: cannot find symbol
        int d=_10;
              ^
  symbol:   variable _10
  location: class aa
1 error
 */
