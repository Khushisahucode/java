
    class livingbeing {

    }
    class animal extends livingbeing{

    }
    class cat extends animal{

    }
    class cow extends animal{

    }
    class dog extends animal{

    }
    class Bdog extends dog{

    }
    class human extends livingbeing{

    }
class plant extends livingbeing{

}
class P{
    public static void main(String[]args){
        Bdog x = new Bdog();
       System.out.println(x instanceof Bdog );
       System.out.println(x instanceof Object );
       System.out.println(x instanceof dog );
       System.out.println(x instanceof livingbeing );
       System.out.println(x instanceof animal );

       

       








    }
}

