public class D {
    public static void main(String[] args) {
        Animal x=new cat();
        dog b= (dog)x;
    }
}
class Animal {

}
class dog extends Animal{}
class cat extends Animal{}
// Exception in thread "main" java.lang.ClassCastException: class cat cannot be cast to class dog (cat and dog are in unnamed module of loader 'app')
//         at D.main(D.java:4)