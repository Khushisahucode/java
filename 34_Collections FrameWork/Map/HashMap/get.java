import java.util.HashMap;
class get{
    public static void main(String[]args){
   HashMap<String,Double>x=new HashMap< String,Double>();
    x.put("mohan",12.56);
     x.put("khushi",19.86);
    x.put("atharv",77.59);
    x.put("sohan",128.56);
     x.put("om",102.56);
    String str=new String("yamraj");
    System.out.println(str+" is : "+ x.get(str));
    String str2=new String("mohan");
    System.out.println(x.get(str2));
    }}
// yamraj is : null
// 12.56