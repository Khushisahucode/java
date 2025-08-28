class z {

    z(int x){

    }
}
class I extends z{
    int q=90;
    I(){
   // super(q);
   super(5);
    System.out.println("value of q :"+ q);
    }
    public static void main(String[] args) {
        I x=new I();
    }
}
