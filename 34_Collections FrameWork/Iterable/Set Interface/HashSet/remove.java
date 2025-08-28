import java.util.HashSet;
class remove{
    public static void main(String[]args){
     HashSet<String>x=new HashSet<String>();
      x.add("kamal");
        x.add("saroj");
        x.add("vineet");
        x.add("rahul");
        x.add("gagan");
       System.out.println("Hashset   is  : "+ x);
    //String y=new String("yamraj");  //false
    String z=new String("kamal");
    System.out.println(x.remove(z));
    System.out.println(x);
    }}
// Hashset   is  : [kamal, gagan, rahul, saroj, vineet]
// true
// [gagan, rahul, saroj, vineet]