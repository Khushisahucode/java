import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Entry_set{
    public static void main(String[]args){
   HashMap<String,Double>x=new HashMap< String,Double>();
    x.put("mohan",12.56);
     x.put("khushi",19.86);
    x.put("atharv",77.59);
    x.put("sohan",128.56);
     x.put("om",102.56);
     Set<Map.Entry<String,Double>> set=x.entrySet();
     for(Map.Entry next:set){
        System.out.println(next.getKey()+ "...."+ next.getValue());
     } }}
// sohan....128.56
// mohan....12.56
// atharv....77.59
// khushi....19.86
// om....102.56
