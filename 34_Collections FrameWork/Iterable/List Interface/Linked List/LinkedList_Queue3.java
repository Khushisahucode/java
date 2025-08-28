import java.util.LinkedList;
public class LinkedList_Queue3 {
    public static void main(String[]args){
        LinkedList<String>x=new LinkedList<String>();
        x.offer("om");
        x.offer("khushi");    //LinkedList as Queue
        x.offer("madhu");
        x.offer("aadi");
        x.offer("riya");
        
   for (int i = 0; i < x.size(); i++) {
       
  
    System.out.println(x.peek());}

     System.out.println(x);
       
    
    }

}
// om
// om
// om
// om
// om
// [om, khushi, madhu, aadi, riya]