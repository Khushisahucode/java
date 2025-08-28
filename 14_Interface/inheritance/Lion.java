public class Lion {
    void show(){
        int x;
        
        System.out.println(x);
    }
    public static void main(String[]args){
    Lion l1=new Lion ();
    l1.show();
    }
}
/*
 * Lion.java:4: error: variable x might not have been initialized
        System.out.println(x);
                           ^
1 error

 */
