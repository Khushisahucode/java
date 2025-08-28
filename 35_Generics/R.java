import java.util.ArrayList;

public class R {
    public static void main(String[] args) {
        Rental <car> r=new Rental<car>();
        car c=new car();
        r.additem(c);
        r.getitem(c);
         Rental <scoorty> r2=new Rental<scoorty>();
          scoorty c2=new scoorty();
        r2.additem(c2);
        r2.getitem(c2);
          Rental <TV> r3=new Rental<TV>();
           TV c3=new TV();
        r3.additem(c3);
        r3.getitem(c3);
        //not ok
        r.additem(c2);
        r2.getitem(c3);
        r3.additem(c1);
    }
}
class Rental<z>{
    ArrayList<z>item=new ArrayList<z>();
    z additem(z x){
        item.add(x);
    }
    z getitem(z x){
         return item.remove(0);
    }
}
class car{}
class scoorty{}
class TV{}
// R.java:18: error: incompatible types: scoorty cannot be converted to car
//         r.additem(c2);
//                   ^
// R.java:19: error: incompatible types: TV cannot be converted to scoorty
//         r2.getitem(c3);
//                    ^
// R.java:20: error: cannot find symbol
//         r3.additem(c1);
//                    ^
//   symbol:   variable c1
//   location: class R