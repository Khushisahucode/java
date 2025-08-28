class r1{

}
class r2 extends r1{
    r1(){

    }
}

public class abcc {
    public static void main(String[] args) {
        r2 x=new r2();
    }
    
}
/*
 * abcc.java:5: error: invalid method declaration; return type required
    r1(){
    ^
1 error
 */
