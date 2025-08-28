 class K{
    static void pro(int...x) {
        for(int next:x)
        System.out.println(next);
    }   
     public static void main(String[] args) {
        float f=34.5f;
        byte b=13;
        short s=127;
        double d=34.78;
        long l=45657l;
        char c=65; int i=56;
          K.pro(c,s,b,i);
        K.pro(l);
         K.pro(d);
          K.pro(f);
     }}
//      K.java:14: error: method pro in class K cannot be applied to given types;
//         K.pro(l);
//          ^
//   required: int[]
//   found:    long
//   reason: varargs mismatch; possible lossy conversion from long to int
// K.java:15: error: method pro in class K cannot be applied to given types;
//          K.pro(d);
//           ^
//   required: int[]
//   found:    double
//   reason: varargs mismatch; possible lossy conversion from double to int
// K.java:16: error: method pro in class K cannot be applied to given types;
//           K.pro(f);
//            ^
//   required: int[]
//   found:    float
//   reason: varargs mismatch; possible lossy conversion from float to int
// 3 errors