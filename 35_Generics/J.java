public class J {
    public static void main(String[] args) {
        Animal [] x=new dog[6];
        x [0]= new dog();
        x [1]= new cat();
        x [2]= new bdog();
        x [3]= new Animal();
        for(Animal nx:x){
            System.out.println(nx);
        }
    }
}
// Exception in thread "main" java.lang.ArrayStoreException: cat
//         at J.main(J.java:5)