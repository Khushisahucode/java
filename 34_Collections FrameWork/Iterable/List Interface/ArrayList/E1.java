import java.util.ArrayList;
class E1{
    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        System.out.println("ArrayList   : "+x);
        x.add("om");
        x.add("khushi");
        x.add("madhu");
        x.add("om");
        x.add("aadi");
        x.add("riya");
        x.add("om");
        System.out.println(  "ArrayList : "+x);
        String str=new String("om");
        x.remove(str);
        System.out.println(  "ArrayList : "+x);
         x.remove(str);
        System.out.println(  "ArrayList : "+x);
          x.remove(str); 
        System.out.println(  "ArrayList : "+x);
          x.remove(str);
    }
}

