package a;


class A extends student{

    public static void main(String[]args)
   
     throws CloneNotSupportedException {
    A x=new A();
    x.name= "aadii!!";
    x.age= 14;
   A y=(A)x.clone();
    System.out.print(" name : ");
    System.out.println(y.name);
    System.out.print("age :");
    System.out.println(y.age);
    System.out.println(x);
    System.out.println(y);

     }
    }
   

