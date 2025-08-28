import java.util.TreeSet;

class add {
    public static void main(String[] args) {
        TreeSet<Integer> x = new TreeSet<Integer>();
        x.add(-20);
        x.add(11);
        x.add(-2);
        x.add(23);
        x.add(111);
        System.out.println("TreeSet is : " + x);

    }
}// ordered and sorted
 // TreeSet is : [-20, -2, 11, 23, 111]