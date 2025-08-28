import java.util.Vector;
class remove8{
    public static void main(String[] args) {
        Vector<student3>x=new Vector<student3>();
        student3 s1=new student3("khushi",22);
        student3 s2=new student3("madhu",18);
        student3 s3=new student3("riya",15);
        student3 s4=new student3("arvi",10);
        student3 s5=new student3("shresth",5);
        x.add(s1);
        x.add(s2);
        x.add(s3);
        x.add(s4);
        x.add(s5);
        System.out.println("student3 Vector is : "+ x);
        student3 ss=new student3("riya",18);
        x.get(2);
         System.out.println(x.remove(ss));
         System.out.println("List is : "+x);

    }
}
// student3 Vector is : [khushi-22, madhu-18, riya-15, arvi-10, shresth-5]
// true
// List is : [khushi-22, madhu-18, arvi-10, shresth-5]