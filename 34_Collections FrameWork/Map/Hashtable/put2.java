import java.util.Hashtable;
class put2{
    public static void main(String[]args){
   Hashtable<student,Double>x=new Hashtable< student,Double>();
    x.put(new student("khushi",12),12.56);
    x.put(new student("om",10),112.56);
   x.put(new student("riya",18),186.56);
   x.put(new student("madhu",23),136.6);
   x.put(new student("bhoomi",45),120.56);
   x.put(new student("ashvi",62),132.56);
    Double d=22.56;
    System.out.println( x); 
     System.out.println( x.put(new student("khushi",12),d));
     System.out.println( x); 
       Double d2=92.56;
     System.out.println( x.put(new student("khushi",35),d2));
     System.out.println( x); 
     System.out.println( x.put(new student("ashvi",34),d2));
     System.out.println( x); 
 }
}
// 12.56
// {bhoomi ~ 45=120.56, riya ~ 18=186.56, om ~ 10=112.56, madhu ~ 23=136.6, ashvi ~ 62=132.56, khushi ~ 12=12.56}
// 110 ~~~~khushi ~ 34
// null
// {bhoomi ~ 45=120.56, riya ~ 18=186.56, om ~ 10=112.56, madhu ~ 23=136.6, khushi ~ 34=92.56, ashvi ~ 62=132.56, khushi ~ 12=12.56}
// 93 ~~~~ashvi ~ 34
// null
// {bhoomi ~ 45=120.56, ashvi ~ 34=92.56, riya ~ 18=186.56, om ~ 10=112.56, madhu ~ 23=136.6, khushi ~ 35=92.56, ashvi ~ 62=132.56, khushi ~ 12=12.56}