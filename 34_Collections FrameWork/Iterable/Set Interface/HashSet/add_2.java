// Duplicate are not Allowed
import java.util.HashSet;
class add_2{
    public static void main(String[]args){
     HashSet<User>x=new HashSet<User>();
       User s1=new User("khushi",22);
        User s2=new User("madhu",18);
        User s3=new User("khushi",15);
        User s4=new User("arvi",10);
        User s5=new User("khushi",15);
        x.add(s1);
        x.add(s2);
        x.add(s3);
        x.add(s4);
        x.add(s5);
         System.out.println("Hashset is : "+ x);

    }}
// 92........khushi-22
// 60........madhu-18
// 85........khushi-15
// 56........arvi-10
// 85........khushi-15
// khushi-15....compare To....khushi-15
// Hashset is : [khushi-15, arvi-10, khushi-22, madhu-18]