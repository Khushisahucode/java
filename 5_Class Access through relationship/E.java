public class E extends E1 {

     public static void main(String[] args) {
        E x=new E();
        x.pro();
        x.age =34;
        E.name ="khushi";
        E1.name ="riya";
        //Access through inheritance
        System.out.print("age :");
        System.out.println(x.age);
        System.out.print("name :");
        System.out.println(E.name);
         System.out.print(name);

        
    }
}
    class E1{
        int age;
        static  String name;
        void pro(){
            age =67;
            System.out.print("age :");
            System.out.println(age);
        
}
    }
