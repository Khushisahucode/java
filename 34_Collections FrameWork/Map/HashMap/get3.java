import java.util.HashMap;
import java.util.Set;
class get3{
    public static void main(String[]args){
   HashMap<String,Double>x=new HashMap< String,Double>();
    x.put("mohan",12.56);
     x.put("khushi",19.86);
    x.put("atharv",77.59);
    x.put("sohan",128.56);
     x.put("om",102.56);
  Set< String> keyset =x.keySet();
  for ( String nextkey : x) {
      System.out.println( "key : "+nextkey + "  &   value : "+ x.get(nextkey));
  }}}
//   get3.java:12: error: for-each not applicable to expression type
//   for ( String nextkey : x) {
//                          ^
//   required: array or java.lang.Iterable
//   found:    HashMap<String,Double>
// 1 error