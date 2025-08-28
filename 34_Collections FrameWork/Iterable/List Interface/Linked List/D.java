import java.util.LinkedList;
class D {
    public static void main(String[] args) {
        LinkedList x = new LinkedList();
        System.out.println("LinkedList  size : "+x.size());
        x.add("om");
        x.add("khushi");
        x.add("madhu");
        x.add("om");
        x.add("aadi");
        x.add("riya");
        x.add(127346575);
        System.out.println(  "LinkedList size: "+x.size());
    }
}
// LinkedList  size : 0
// LinkedList size: 7