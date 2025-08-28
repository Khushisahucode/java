class L2{
    static void pro(String...x) {
 for(String next:x)
        System.out.println(next);
    }
    static void pro(String[]y){
 for(String next:y)
        System.out.println(next);
    }
     public static void main(String[] args) {
        pro("raju","om");
     }}
//      M.java:6: error: cannot declare both pro(String[]) and pro(String...) in L2
//     static void pro(String[]y){
//                 ^
// 1 error