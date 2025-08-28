import java.util.HashSet;
public class remove2 {
    public static void main(String[] args) {
        HashSet<student1>x=new HashSet<student1>();
         student1 s1=new student1("khushi",22);
        student1 s2=new student1("madhu",18);
        student1 s3=new student1("riya",15);
        student1 s4=new student1("arvi",10);
        student1 s5=new student1("shresth",5);
        x.add(s1);
        x.add(s2);
        x.add(s3);
        x.add(s4);
        x.add(s5);
        student1 y=new student1("arvi",10);
        System.out.println(x.remove(y));
        System.out.println(x);
    }
}//false
//[khushi-22, arvi-10, madhu-18, shresth-5, riya-15]
