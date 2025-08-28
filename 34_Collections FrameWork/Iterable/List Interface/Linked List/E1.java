import java.util.LinkedList;
class E1{
    public static void main(String[] args) {
        LinkedList x = new LinkedList();
        System.out.println("LinkedList   : "+x);
        x.add("om");
        x.add("khushi");
        x.add("madhu");
        x.add("om");
        x.add("aadi");
        x.add("riya");
        x.add("om");
        System.out.println(  "LinkedList : "+x);
        String str=new String("om");
        x.remove(str);
        System.out.println(  "LinkedList : "+x);
         x.remove(str);
        System.out.println(  "LinkedList : "+x);
          x.remove(str); 
        System.out.println(  "LinkedList : "+x);
          x.remove(str);
    }
}

