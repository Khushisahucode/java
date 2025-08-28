// Duplicate are not Allowed
import java.util.HashSet;
class add_3{
    public static void main(String[]args){
     HashSet<User>x=new HashSet<User>();
       User s1=new User("khushi",22);
        User s2=new User("madhu",18);
        User s3=new User("mohan",15);
        User s4=new User("arvi",10);
        User s5=new User("hanmo",15);
        x.add(s1);
        x.add(s2);
        x.add(s3);
        x.add(s4);
        x.add(s5);
         System.out.println("Hashset is : "+ x);

    }}
// 92........khushi-22
// 60........madhu-18
// 61........mohan-15
// 56........arvi-10
// 61........hanmo-15
// hanmo-15....compare To....mohan-15
// Hashset is : [arvi-10, khushi-22, madhu-18, mohan-15, hanmo-15]