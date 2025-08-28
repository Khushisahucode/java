import java.util.Hashtable;
class put4{public static void main(String[]args){
   Hashtable<User2,Double>x=new Hashtable< User2,Double>();
    x.put(new User2("khushi",12),12.56);
    x.put(new User2("om",10),112.56);
   x.put(new User2("riya",18),186.56);
   x.put(new User2("madhu",23),136.6);
   x.put(new User2("bhoomi",45),120.56);
   x.put(new User2("ashvi",62),132.56);
    Double d=22.56;
    System.out.println( x); 
     System.out.println( x.put(new User2("khushi",12),d));
     System.out.println( x); 
       Double d2=92.56;
     System.out.println( x.put(new User2("khushi",34),d2));
     System.out.println( x); }}
// 82........khushi-12
// 36........om-10
// 67........riya-18
// 65........madhu-23
// 101........bhoomi-45
// 116........ashvi-62
// {madhu-23=136.6, ashvi-62=132.56, khushi-12=12.56, om-10=112.56, bhoomi-45=120.56, riya-18=186.56}
// 82........khushi-12
// khushi-12....compare To....khushi-12
// 12.56
// {madhu-23=136.6, ashvi-62=132.56, khushi-12=22.56, om-10=112.56, bhoomi-45=120.56, riya-18=186.56}
// 104........khushi-34
// null
// {madhu-23=136.6, ashvi-62=132.56, khushi-34=92.56, khushi-12=22.56, om-10=112.56, bhoomi-45=120.56, riya-18=186.56}