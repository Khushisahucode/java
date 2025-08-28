
import java.util.LinkedHashMap;

class nullkey_value {

    public static void main(String[] args) {
        LinkedHashMap<String, Double> x = new LinkedHashMap< String, Double>();
        x.put("mohan", 12.56);
        x.put(null, 19.86);
        x.put("atharv", 77.59);
        x.put("sohan", null);
        x.put(null, 102.56);

        System.out.println(x);
    }
}
// null are not allowed  as key and value
//  {mohan=12.56, null=102.56, atharv=77.59, sohan=null}
