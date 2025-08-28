import java.util.*;
class set{
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();  //Type Safety By Compilor Erasor
        x.add("om");
        x.add("khushi");
        x.add("madhu");
        x.add("om");
        x.add("aadi");
        x.add("riya");
    System.out.println(x);
    x.set(2,"ragat");
        System.out.println(x); 
    
       
        }  }