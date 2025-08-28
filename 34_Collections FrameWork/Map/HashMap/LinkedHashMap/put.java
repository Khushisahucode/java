
import java.util.LinkedHashMap;

class put {

    public static void main(String[] args) {
        LinkedHashMap<String, Double> x = new LinkedHashMap< String, Double>();
        x.put("mohan", 12.56);
        x.put("khushi", 19.86);
        x.put("atharv", 77.59);
        x.put("sohan", 128.56);
        x.put("om", 102.56);
        System.out.println(" LinkedHashMap is : " + x);

    }
}// ordered but not sorted
// LinkedHashMap is : {mohan=12.56, khushi=19.86, atharv=77.59, sohan=128.56, om=102.56}