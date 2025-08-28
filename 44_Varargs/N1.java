class N1{
    
    static void pro(int... x) {
        System.out.println("Hello");
    }

    static void pro(Integer... x) {
        System.out.println("Hi");
    }
    
    public static void main(String[] args) {
        pro(12, 34, 67);
    }
}
// N1.java:12: error: reference to pro is ambiguous
//         pro(12, 34, 67);
//         ^
//   both method pro(int...) in N1 and method pro(Integer...) in N1 match
// 1 error