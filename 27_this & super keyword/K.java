

class user{
String name;
int age;
user(String name,int age){
    this.name=name;
    this.age=age;

}
}
class Student extends user{
    String degree;
    String semester ;
    int marks;
    Student(String degree ,String semester,int marks,String name,int age){
         super( name,  age);
        this.degree=degree;
        this.semester=semester;
        this.marks=marks;
    }
}

public class K {
    public static void main(String[] args) {
        Student s=new Student("B.TECH","fourth",90,"khushi sahu",22);
    System.out.println(" student name = "+ s.name);
    System.out.println(" student age = "+ s.age);
    System.out.println(" student degree = "+ s.degree);
    System.out.println(" student semester = "+ s.semester);
    System.out.println(" student marks = "+ s.marks);
   
}

}
//  student name = khushi sahu
//  student age = 22
//  student degree = B.TECH
//  student semester = fourth
//  student marks = 90