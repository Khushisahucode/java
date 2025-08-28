import java.util.HashMap;
import java.util.Set;
class get2{
    public static void main(String[]args){
   HashMap<String,Double>x=new HashMap< String,Double>();
    x.put("mohan",12.56);
     x.put("khushi",19.86);
    x.put("atharv",77.59);
    x.put("sohan",128.56);
     x.put("om",102.56);
  Set< String> keyset =x.keySet();
  for ( String nextkey : keyset) {
      System.out.println( "key : "+nextkey + "  &   value : "+ x.get(nextkey));
  }}}
//     key : sohan  &   value : 128.56
// key : mohan  &   value : 12.56
// key : atharv  &   value : 77.59
// key : khushi  &   value : 19.86
// key : om  &   value : 102.56

