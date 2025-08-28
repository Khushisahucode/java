import java.util.LinkedList;
class add3{
    public static void main(String[] args) {
        LinkedList<student>x=new LinkedList<student>();
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
        System.out.println("student LinkedList is : "+ x);

    }
}
// student LinkedList is : [student@2f92e0f4, student@28a418fc, student@5305068a, student@1f32e575, student@279f2327]