import java.util.LinkedList;
public class LinkedList_Queue2 {
    public static void main(String[]args){
        LinkedList<String>x=new LinkedList<String>();
        x.offer("om");
        x.offer("khushi");    //LinkedList as Queue
        x.offer("madhu");
        x.offer("aadi");
        x.offer("riya");
    
     System.out.println(x);
       int sz=x.size();
    
     for (int i = 0; i < sz; i++) {
         System.out.println("poped element is : " + x.poll());
     }
    System.out.println(x);
    }

}
// [om, khushi, madhu, aadi, riya]
// poped element is : om
// poped element is : khushi
// poped element is : madhu
// poped element is : aadi
// poped element is : riya
// []