
public class mainoverriding {
    
    public static void main(String[] args) {
        String x[]={"khushi","madhu","riya"};
        main(x);
        String[]y={"a","bf","df"};
        main(y);
    }
    public static void main(String[] args) {
        System.out.println("hey");
    }
      
}
class a extends mainoverriding{
    public static void main(String[] args) {
        System.out.println("hello");
    }
}

/*
 * mainoverriding2.java:9: error: method main(String[]) is already defined in class mainoverriding2
    public static void main(String[] args) {
                       ^
1 error
 */