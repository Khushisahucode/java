package a;
class A {
String name;
int age;
    public static void main(String[]args)
   
     throws CloneNotSupportedException {
    student x=new student();
    x.name= "aadii!!";
    x.age= 14;
    student y=(student)x.clone();
    System.out.print(" name : ");
    System.out.println(y.name);
    System.out.print("age :");
    System.out.println(y.age);
    System.out.println(x);
    System.out.println(y);

     }
    }
    /*
     *  name : jagjeet
age :23
a.student@372f7a8d
a.student@2f92e0f4
     */

