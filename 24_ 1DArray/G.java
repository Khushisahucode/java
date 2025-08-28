public class G {
    public static void main(String[] args) {
        student arr[]=new student[6];
        System.out.println(arr[0]instanceof String);
    }
}
/*
 * G.java:4: error: incompatible types: student cannot be converted to String
        System.out.println(arr[0]instanceof String);
                              ^
1 error
 */