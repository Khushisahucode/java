
//class type data type
public class G2 {
    public static void main(String[]args){
          animal []x=new Dog[5];
   x[0]=new bdog();
   x[1]=new cat();
   x[2]=new cow();
   x[3]=new Dog();
   x[4] =new Dog();
    }
}
/*
 Exception in thread "main" java.lang.ArrayStoreException: cat
        at G2.main(G2.java:7)
 */