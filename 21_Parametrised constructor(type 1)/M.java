public class M {
    final int x;
    M(){
        x=90;
    }
    M(int y){

    }
    public static void main(String[] args) {
        M s=new M();
        System.out.println("value of x :"+s.x);
    }
}
/*
 * M.java:8: error: variable x might not have been initialized
    }
    ^
1 error
 */
