import java.util.Hashtable;
class put{
    public static void main(String[]args){
   Hashtable<String,Double>x=new Hashtable< String,Double>();
    x.put("mohan",12.56);
     x.put("khushi",19.86);
    x.put("atharv",77.59);
    x.put("sohan",128.56);
     x.put("om",102.56);
    System.out.println(" Hashtable is : "+ x);

    }
} // ordering --->No
  //sorted---->No
//  Hashtable is : {sohan=128.56, mohan=12.56, atharv=77.59, khushi=19.86, om=102.56}