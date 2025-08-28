package a;

public class student {
    public static void main(String[] args)  throws ClassNotFoundException {
        Class klass=Class.forName("b.x.y.User");
        System.out.println(klass);
    }
}

//class b.x.y.User