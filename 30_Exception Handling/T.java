public class T {
    int count =0;
      public static void main(String[] args) {
        T t=new T();
        System.out.println("A");
        try{
           t. pro();
        }catch(Exception e){
System.out.println(e);
        }finally{
            System.out.println("essential code");
        }System.out.println("Z");
    }
     void pro(){
        System.out.println(count++);
        pro();
    }
 }
//stack overflow error