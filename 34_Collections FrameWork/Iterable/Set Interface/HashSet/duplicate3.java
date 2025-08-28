// Duplicate are not Allowed
import java.util.HashSet;
class duplicate3{
    public static void main(String[]args){
     HashSet<student>x=new HashSet<student>();
       student s1=new student("khushi",22);
        student s2=new student("madhu",18);
        student s3=new student("khushi",15);
        student s4=new student("arvi",10);
        student s5=new student("khushi",5);
        x.add(s1);
        x.add(s2);
        x.add(s3);
        x.add(s4);
        x.add(s5);
         System.out.println("Hashset is : "+ x);

    }}
    // Hashset is : [khushi-22, arvi-10, madhu-18, khushi-5, khushi-15]