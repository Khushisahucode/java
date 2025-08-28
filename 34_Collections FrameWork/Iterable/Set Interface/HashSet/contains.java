import java.util.HashSet;
public class contains {
    public static void main(String[] args) {
        HashSet<student>x=new HashSet<student>();
         student s1=new student("khushi",22);
        student s2=new student("madhu",18);
        student s3=new student("riya",15);
        student s4=new student("arvi",10);
        student s5=new student("shresth",5);
        x.add(s1);
        x.add(s2);
        x.add(s3);
        x.add(s4);
        x.add(s5);
        student y=new student("arvi",10);
        System.out.println(x.contains(y));
    }
}
//false