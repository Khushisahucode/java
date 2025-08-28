class a{

}
class b extends a{

}
class c extends b{

}


public class E extends c {
    public static void main(String[]args)
    {
        a x=new c(); 
        b x2=new c();
        c x3=new c();
        Object x4=new c();
       
         System.out.println(x);
         System.out.println(x2);
         System.out.println(x3); 
         System.out.println(x4);



    } 
}
