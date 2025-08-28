public class Immutable_string {
    public static void main(String[] args) {
        String x= "mohan";
        String y=x;
        System.out.println(x==y);
        System.out.println(x);
         System.out.println(y);
          x="sohan";
    
        System.out.println(x);
         System.out.println(y);
   System.out.println(x==y);
    }
}
// true
// mohan
// mohan
// sohan
// mohan
// false