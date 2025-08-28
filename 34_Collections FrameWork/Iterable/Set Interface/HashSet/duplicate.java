// Duplicate are not Allowed
import java.util.HashSet;
class duplicate{
    public static void main(String[]args){
     HashSet<String>x=new HashSet<String>();
       x.add("khushi");
        x.add("om");
        x.add("khushi");
         x.add("rahul");
         x.add("khushi");
         System.out.println("Hashset is : "+ x);

    }}
//Hashset is : [rahul, khushi, om]