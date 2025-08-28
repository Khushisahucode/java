import java.util.Hashtable;
class Null_key{
    public static void main(String[]args){
   Hashtable<String,Double>x=new Hashtable< String,Double>();
    x.put("mohan",12.56);
     x.put("khushi",null);
    x.put(null,77.59);
    x.put("sohan",128.56);
     x.put("om",102.56);
    System.out.println(" Hashtable is : "+ x);

    }//null are not allowed as value and key
 }
// Exception in thread "main" java.lang.NullPointerException
//         at java.base/java.util.Hashtable.put(Hashtable.java:477)
//         at Null_key.main(Null_key.java:6)
// PS D:\Java Coaching Code\34_Collections FrameWork\Map\Hashtable> 

