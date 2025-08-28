
class z1{
     static void show(){
        System.out.println("Namaste.....");
    }
}

public class D extends z1 { 
     static void show(){
    System.out.println("Thanking you.....");
}
public static void main(String[] args) {
    z1 x = new D();
    x.show();
}
}
//static case 
//No Dynamic dismatch
