class H {
    static void mno(String... x,int...y) {

    }   
    
    public static void main(String[] args) {
        H.mno("om","ram","khushi",45,6,4,);
       
        

        
    }
}
// H.java:2: error: varargs parameter must be the last parameter
//     static void mno(String... x,int...y) {
//                               ^
// H.java:6: error: illegal start of expression
//         G.mno("om","ram","khushi",45,6,4,);
//                                          ^
// 2 errors