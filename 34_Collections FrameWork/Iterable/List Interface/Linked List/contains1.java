import java.util.LinkedList;
class contains1{
    public static void main(String[] args) {
        LinkedList<student2>x=new LinkedList<student2>();
        student2 s1=new student2("khushi",22);
        student2 s2=new student2("madhu",18);
        student2 s3=new student2("riya",15);
        student2 s4=new student2("arvi",10);
        student2 s5=new student2("shresth",5);
        x.add(s1);
        x.add(s2);
        x.add(s3);
        x.add(s4);
        x.add(s5);
        System.out.println("student2 LinkedList is : "+ x);
        student ss=new student("riya",18);
        x.get(2);
         System.out.println(x.contains(ss));
         System.out.println("List is : "+x);

    }
}
// student2 LinkedList is : [khushi-22, madhu-18, riya-15, arvi-10, shresth-5]
// false
// List is : [khushi-22, madhu-18, riya-15, arvi-10, shresth-5]