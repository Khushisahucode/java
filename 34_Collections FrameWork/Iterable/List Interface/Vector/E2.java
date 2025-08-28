import java.util.Vector;
class E2{
    public static void main(String[] args) {
        Vector x = new Vector();
        System.out.println("Vector   : "+x);
        x.add("om");
        x.add("khushi");
        x.add("madhu");
        x.add("om");
        x.add("aadi");
        x.add("riya");
        x.add("om");
        System.out.println(  "Vector : "+x);
        String str=new String("om");
        x.remove(str);
       while(x.remove(str));
       System.out.println(  "Vector : "+x);
    }
}

