import java.util.HashSet;
public class remove3 {
    public static void main(String[] args) {
        HashSet<User>x=new HashSet<User>();
         User s1=new User("khushi",22);
        User s2=new User("madhu",18);
        User s3=new User("riya",15);
        User s4=new User("arvi",10);
        User s5=new User("shresth",5);
        x.add(s1);
        x.add(s2);
        x.add(s3);
        x.add(s4);
        x.add(s5);
        User y=new User("arvi",10);
        System.out.println(x.remove(y));
        System.out.println(x);
    }
}
// 92........khushi-22
// 60........madhu-18
// 64........riya-15
// 56........arvi-10
// 95........shresth-5
// 56........arvi-10
// arvi-10....compare To....arvi-10
// true
// [riya-15, khushi-22, madhu-18, shresth-5]
