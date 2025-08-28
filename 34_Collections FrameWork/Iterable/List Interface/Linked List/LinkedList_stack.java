import java.util.LinkedList;
public class LinkedList_stack {
    public static void main(String[]args){
        LinkedList<String>x=new LinkedList<String>();
        x.push("om");
        x.push("khushi");   //LinkedList as stack
        x.push("madhu");
        x.push("aadi");
        x.push("riya");
 
     System.out.println(x);
     
       
    // [riya, aadi, madhu, khushi, om]
    }
}
