
public class T4 {

    public static void main(String[] args) {
        dog s = new dog();
        cow l = new cow();
        Animal l3 = new Animal();
        hdog s2 = new hdog();
        fdog s3 = new fdog();
        livingbeing l2 = new livingbeing();
        cat v = new cat();
        T4 x5 = new T4(l3);
        T4 x = new T4(l);
        T4 x3 = new T4(s3);
        T4 x2 = new T4(s2);
        T4 x4 = new T4(v);
    }

    <T extends dog> T4(T t) {
        System.out.println(t);
    }
}
//T4.java:12: error: constructor T4 in class T4 cannot be applied to given types;
//         T4 x5 = new T4(l3);
//                 ^
//   required: T
//   found:    Animal
//   reason: inference variable T has incompatible bounds
//     upper bounds: dog
//     lower bounds: Animal
//   where T is a type-variable:
//     T extends dog declared in constructor <T>T4(T)
// T4.java:13: error: constructor T4 in class T4 cannot be applied to given types;
//         T4 x = new T4(l);
//                ^
//   required: T
//   found:    cow
//   reason: inference variable T has incompatible bounds
//     upper bounds: dog
//     lower bounds: cow
//   where T is a type-variable:
//     T extends dog declared in constructor <T>T4(T)
// T4.java:16: error: constructor T4 in class T4 cannot be applied to given types;
//         T4 x4 = new T4(v);
//                 ^
//   required: T
//   found:    cat
//   reason: inference variable T has incompatible bounds
//     upper bounds: dog
//     lower bounds: cat
//   where T is a type-variable:
//     T extends dog declared in constructor <T>T4(T)
// 3 errors