import java.util.HashMap;
class contains2{
    public static void main(String[]args){
   HashMap<student,Double>x=new HashMap< student,Double>();
    x.put(new student("khushi",12),12.56);
    x.put(new student("om",10),112.56);
   x.put(new student("riya",18),186.56);
   x.put(new student("madhu",23),136.6);
   x.put(new student("bhoomi",45),120.56);
   x.put(new student("ashvi",62),132.56);
   student s=new student("khushi",12);
    System.out.println( x); 
    System.out.println( x.containsKey(s));
   //  System.out.println( x); 
 }
}
