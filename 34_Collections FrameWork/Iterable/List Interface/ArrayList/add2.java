import java.util.*;
class add2{
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();  //Type Safety By Compilor Erasor
        x.add("om");
        x.add(67);
        x.add(55.7);
        x.add(true);
        x.add(67.8f);
    
    System.out.println(x);
    x.add(2,"ragat");
        System.out.println(x); 
    
       
        }  }