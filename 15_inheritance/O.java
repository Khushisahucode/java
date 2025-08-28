class r1{

}
class r2 extends r1{

}
class r3 extends r2{

}

public class O extends r3{
    public static void main(String[] args) {
        O x=new O();
        System.out.println(x instanceof O);
        System.out.println(x instanceof r1);
        System.out.println(x instanceof r2);
        System.out.println(x instanceof r3);
        System.out.println(x instanceof Object);

    }  
    }
   