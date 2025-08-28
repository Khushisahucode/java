class P2 {
    static void pro(int...[] marks) {
        for(int[] next : marks)
        for(int nx:next)
            System.out.println(nx); 
        System.out.println("~~~~~~~~~~~");
        
    }

    public static void main(String[] args) {
        int [][]arr={{23,45},{45,6,7}};
        pro(arr);
    }    
}
// P2.java:2: error: <identifier> expected
//     static void pro(int...[] marks) {
//                           ^
// P2.java:2: error: ',', ')', or '[' expected
//     static void pro(int...[] marks) {
//                             ^
// 2 errors