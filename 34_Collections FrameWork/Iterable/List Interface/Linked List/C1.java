import java.util.LinkedList;
class C1 {
    public static void main(String[] args) {
        LinkedList x = new LinkedList();
        System.out.println("LinkedList : "+x);
        x.add("om");
        x.add(45.90);
        x.add(89.7f);
        x.add(true);
        x.add(100);
        x.add('A');
        x.add(127346575);
        System.out.println(  "LinkedList : "+x);
    }
}
