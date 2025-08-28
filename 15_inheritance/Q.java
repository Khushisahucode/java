interface F{

}
interface G{

}
interface D{

}
class C{

}
interface E extends F,G{

}
class B extends C implements D{

}
class A extends B implements E{

}
 public class Q {
    public static void main(String[]args){
        A a1=new A();
        System.out.println(a1 instanceof A);
        System.out.println(a1 instanceof B);
        System.out.println(a1 instanceof C);
        System.out.println(a1 instanceof D);
        System.out.println(a1 instanceof E);
        System.out.println(a1 instanceof F);
        System.out.println(a1 instanceof G);
           }
}
