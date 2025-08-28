public class char_at3 {
    
        public static void main(String[]args) {
               String str="aman";
               System.out.println(str.charAt(4));
            
        }
    }

    // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 4 out of bounds for length 4
    // at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)
    // at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:52)
    // at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:213)
    // at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:210)
    // at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:98)
    // at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
    // at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
    // at java.base/java.lang.String.checkIndex(String.java:4930)
    // at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:46)