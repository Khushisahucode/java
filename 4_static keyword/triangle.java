public class triangle {
    int side;
    int angle;
    static int cornernum=3;
    public static void main(String[] args) {
        System.out.println("triangles details are here ;");
        triangle t1=new triangle()  ;
      t1.side=45;
      t1.angle=23;
      System.out.println("Triangle1  :");
      System.out.print("side :");
      System.out.println(t1.side);
      System.out.print("Angle :");
      System.out.println(t1.angle );
      System.out.print("corners are  :");
      System.out.println(cornernum);
       show();
       triangle t2=new triangle()  ;
      t2.side=40;
      t2.angle=31;
       System.out.println("Triangle2  :");

      System.out.print("side :");
      System.out.println(t2.side);
      System.out.print("Angle :");
      System.out.println(t2.angle );
      System.out.print("corners are  :");
      System.out.println(cornernum);
       show();

       triangle t3=new triangle()  ;
       t3.side=42;
       t3.angle=29;
     System.out.println("triangle 3  :");
       System.out.print("side :");
        System.out.println(t3.side);
       System.out.print("Angle :");
       System.out.println(t3.angle );
       System.out.print("corners are  :");
       System.out.println(cornernum);
        show();

    }
     static void show(){

        System.out.println("Triangle has three sides and three angle");


    }
    
}
