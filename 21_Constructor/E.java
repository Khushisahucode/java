


public  abstract class E {
   //constructor defintion
   //ok
    E(){  

    }
    public static void main(String[]args){
     //  Constructor call
    // not ok
        E x=new E();
        System.out.print("vallue of x:");
       System.out.println(x);
    }
}
/*
 * E.java:11: error: E is abstract; cannot be instantiated
        E x=new E();
            ^
1 error
 */
