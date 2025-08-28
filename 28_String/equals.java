public class equals {
    public static void main(String[] args) {
        employee x=new employee("madhu",20);
        employee y=new employee("madhu",20);
        System.out.println(x==y);
        System.out.println(x.equals(y));
    }
}
/*
false
true
 */