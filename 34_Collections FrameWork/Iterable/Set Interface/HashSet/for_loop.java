import java.util.HashSet;

class for_loop {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("kamal");
        set.add("saroj");
        set.add("vineet");
        set.add("rahul");
        set.add("gagan");
        
        System.out.println(set);

        for(int i=0; i < set.size(); i++) {
            System.out.println(set.get(i));
        }
    }
}
// get.java:16: error: cannot find symbol
//             System.out.println(set.get(i));
//                                   ^
//   symbol:   method get(int)
//   location: variable set of type HashSet<String>
// 1 error