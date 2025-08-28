import java.util.ArrayList;
public class Q {
    public static void main(String[] args) {
        ArrayList<  ? super dog >list=new ArrayList<Object>();
        ArrayList<  ? super dog >list2=new ArrayList<Animal>();
        ArrayList<  ? super Animal >list3=new ArrayList<livingbeing>();
        ArrayList<  ? super dog >list4=new ArrayList<dog>();
       
        // list.add(new bdog());
        // list.add(new dog());
        // list.add(new hdog());
        // list.add(new fdog()); 
        // list.add(new livingbeing()); // not ok
        // list.add(new Object()); // not ok
        
        //  list2.add(new bdog());
        // list2.add(new dog());
        // list2.add(new hdog());
        // list2.add(new fdog()); 
        // list2.add(new livingbeing()); // not ok
        // list2.add(new Object()); // not ok

         list4.add(new bdog());
        list4.add(new dog());
        list4.add(new hdog());
        list4.add(new fdog()); 
        list4.add(new livingbeing()); // not ok
        list4.add(new Object()); // not ok

         list3.add(new bdog());
        list3.add(new dog());
        list3.add(new hdog());
        list3.add(new fdog()); 
         list3.add(new cow());
        list3.add(new cat());
        list3.add(new Animal());
        list3.add(new livingbeing()); // not ok
        list3.add(new Object()); // not ok
   
    }
}