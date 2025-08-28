public class T3 {
    public static void main(String[] args) {
        dog s=new dog();
        cow l=new cow();
        Animal l3=new Animal();
         hdog s2=new hdog();
        fdog s3=new fdog();
        livingbeing l2=new livingbeing();
        cat v=new cat();
        T3 x5=new T3(l3);
        T3 x=new T3(l);
        T3 x3=new T3(s3);
         T3 x2=new T3(s2);
         T3 x4=new T3(v);
         }
        <T> T3(T t){
        System.out.println(t);
    }
}
// Animal@54bedef2
// cow@5caf905d
// fdog@27716f4
// hdog@8efb846
// cat@2a84aee7


