
class student {
int count ;
student(){
    count++;
}
}
class A{
public static void main(String[] args) {
    student s1=new student();
    student s2=new student();
    student s3=new student();
    
     student s4=new student();
      System.out.println(s1.count);
      System.out.println(s2.count);
      System.out.println(s3.count);
      System.out.println(s4.count);


} 
}