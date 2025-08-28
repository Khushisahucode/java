public class Student1 extends user {
    String name;
    String  degree;
    int rollno;
    Student1(){

    }
    public static void main(String[] args) {
        Student1 s=new Student1();
        s.name="khushi";
        s.age =22;
        s.degree="B.TECH";
        System.out.println("name :"+s.name);
        System.out.println("phone :"+s.phone);
        System.out.println("department :"+s.department);
        System.out.println(" age :"+s.age);
    
    }
}
