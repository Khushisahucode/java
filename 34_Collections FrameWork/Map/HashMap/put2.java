import java.util.HashMap;
class put2{
    public static void main(String[]args){
   HashMap<String,Double>x=new HashMap< String,Double>();
    x.put("mohan",12.56);
     x.put("khushi",19.86);
    x.put("atharv",77.59);
    x.put("sohan",128.56);
     x.put("om",102.56);
    System.out.println("after removing "+ x); 
    System.out.println( x.put("mohan",67.88));
 }
}
// after removing {sohan=128.56, mohan=12.56, atharv=77.59, khushi=19.86, om=102.56}
// 12.56