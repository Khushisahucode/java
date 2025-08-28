 class J{
    static void pro(Object...x) {
        for(Object next:x)
        System.out.println(next);
    }   
     public static void main(String[] args) {
        student s=new student();
        J.pro("om","ram","aadi",34.6,56,9f,7l,89,s,day.A,new j1(){});
     }}
interface j1{}
class student {}
enum day{
    A ,B;
}
// aadi
// 34.6
// 56
// 9.0
// 7
// 89
// student@1f32e575
// A
// J$1@279f2327