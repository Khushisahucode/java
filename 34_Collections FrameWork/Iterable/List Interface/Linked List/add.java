import java.util.*;
class add{
    public static void main(String[] args) {
        LinkedList<String> x = new LinkedList<String>();  //Type Safety By Compilor Erasor
        x.add("om");
        x.add("khushi");
        x.add("madhu");
        x.add("om");
        x.add("aadi");
        x.add("riya");
    System.out.println(x);
    x.add(2,"ragat");
        System.out.println(x); 
    
       
        }  }