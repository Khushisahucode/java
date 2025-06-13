class student{
  private int marks;
  private String name;
void getdetails(String name,int marks){//getter function

    this.name=name;
    this.marks=marks;
}
void setdetails(){   //setter function
    System.out.println("student marks = "+marks);
    System.out.println("student name = "+name);
}

}

class Main{
public static void main(String[] args) {
    student x=new student();
    x.getdetails("khushi",90);
 x.setdetails();
}
}