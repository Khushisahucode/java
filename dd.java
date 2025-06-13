public class dd {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        for (int idx = 0; idx <= arr.length; idx++) {
            System.err.println(arr[idx]);
            
        }
    }
}
/*
 * 1
   2
   3
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        at dd.main(dd.java:5)
 */