
class z{
    void show(){
        System.out.println("hello.....");
    }
}

public class C extends z { 
    void show(){
    System.out.println("hey.....");
}
public static void main(String[] args) {
    z s = new C();
    s.show();
}

//runtime polymorphism
// dynamic method dispatch
    
}
