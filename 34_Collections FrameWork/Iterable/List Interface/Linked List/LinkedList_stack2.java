import java.util.LinkedList;
public class LinkedList_stack2 {
    public static void main(String[]args){
        LinkedList<String>x=new LinkedList<String>();
        x.push("om");
        x.push("khushi");   //LinkedList as stack
        x.push("madhu");
        x.push("aadi");
        x.push("riya");
             int sz=x.size();
     System.out.println(x);
     for (int i = 0; i < sz; i++) {
         System.out.println("poped element is : " + x.pop());
     }
       
    
    }
}
// [riya, aadi, madhu, khushi, om]
// poped element is : riya
// poped element is : aadi
// poped element is : madhu
// poped element is : khushi
// poped element is : om