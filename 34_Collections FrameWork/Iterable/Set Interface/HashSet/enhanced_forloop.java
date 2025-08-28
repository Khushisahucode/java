import java.util.HashSet;

class enhanced_forloop {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("kamal");
        set.add("saroj");
        set.add("vineet");
        set.add("rahul");
        set.add("gagan");
        
        System.out.println(set);

        for(String next:set) {
            System.out.println(next);
        }
    }
}
// [kamal, gagan, rahul, saroj, vineet]
// kamal
// gagan
// rahul
// saroj
// vineet