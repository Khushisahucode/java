class Y1{
    Y1(int x){
        System.out.println("hello");
    }
}

public class F extends Y1 {
    F(){
  super(8);
    }
    public static void main(String[] args) {
       System.out.println("A") ;
        F s=new F();
        System.out.println("B");
    }
}
