public class T2 {
    public static void main(String[] args) {
        dog s=new dog();
         hdog s2=new hdog();
          fdog s3=new fdog();
           bdog s4=new bdog();
          livingbeing l=new livingbeing();
        cat v=new cat();
        show(s2);
        show(s);
        show(s3);
        show(s4);
        show(l); //not ok
        show(v);//NOT OK
       }
  static<T extends dog> void show(T t){
        System.out.println(t);
    }
}



