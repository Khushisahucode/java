import java.util.LinkedList;
class C {

    public static void main(String[] args) {
        LinkedList x = new LinkedList();
        System.out.println("LinkedList : "+x);
        x.add(34);
        x.add(45);
        x.add(89);
        x.add(40);
        x.add(100);
        x.add(31);
        x.add(111);
        System.out.println(  "LinkedList : "+x);
    }
 }
// LinkedList : []
// LinkedList : [34, 45, 89, 40, 100, 31, 111]