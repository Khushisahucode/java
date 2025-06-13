 class animal{
    void sum(int x){
        System.out.println("hello = "+ x);
    }
    void sum(int x,int y){
        System.out.println("hello ="+ x+y);
    }
    void sum(int x,int y,int z){
        System.out.println("sum = "+ x+y+z);
    }

}

 
 
 
 public class methodoverloading extends animal {
    public static void main(String[] args) {
        animal a=new animal();
        a.sum(3);
        a.sum(5,7);a.sum(3,67,7);
    }
}/*hello = 3
hello =57
sum = 3677*/
