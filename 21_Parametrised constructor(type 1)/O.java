public class O{

    final int x =98;
    O(){
        x=90;
    }
    O(int y){
    x= 67;
    }
    public static void main(String[] args) {
        O s=new O(6);
        System.out.println("value of x :"+s.x);
        O s1=new O();
        System.out.println("value of x :"+s1.x);
    }
    }
    /*
     * O.java:5: error: cannot assign a value to final variable x
        x=90;
        ^
O.java:8: error: cannot assign a value to final variable x
    x= 67;
    ^
2 errors
     */
