import java.util.*;
class H8{
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();  //Type Safety By Compilor Erasor
        x.add("om");
        x.add("khushi");
        x.add("madhu");
        x.add("om");
        x.add("aadi");
        x.add("riya");
        x.add("om");
        Iterator<String>x1 = x.iterator();
     for (String next:x) {
          System.out.println(next.length()); }
        Object o="mohan";
        System.out.println(  "Length of String : "+((String)o).length());
        }  }
// 2
// 6
// 5
// 2
// 4
// 4
// 2
//length of String : 5