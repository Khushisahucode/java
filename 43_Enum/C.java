 enum Days {
    sunday,monday,tuesday,wednesday,thursday,friday,saturday,
}
class C{
    Days x;
    public static void main(String[]args){
    System.out.println(x);

    }
}
// C.java:7: error: non-static variable x cannot be referenced from a static context
//     System.out.println(x);
//                        ^
// 1 error
