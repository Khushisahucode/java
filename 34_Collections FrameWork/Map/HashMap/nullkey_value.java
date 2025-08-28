
import java.util.HashMap;

class nullkey_value {

    public static void main(String[] args) {
        HashMap<String, Double> x = new HashMap< String, Double>();
        x.put("mohan", 12.56);
        x.put(null, 19.86);
        x.put("atharv", 77.59);
        x.put("sohan", null);
        x.put(null, 102.56);

        System.out.println(x);
    }
}
// null are allowed as key and value
 //   null=102.56, sohan=null, mohan=12.56, atharv=77.59}
