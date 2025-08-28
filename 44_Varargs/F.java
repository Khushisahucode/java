class F {
    static void mno(int... x) {
        System.out.println(x.length);
    }   
    
    public static void main(String[] args) {
        F.mno();
        F.mno(12);
        F.mno(12, 23);
        F.mno(12, 23, 45);
        F.mno(12, 23, 45, 56);

        int[] w = {1, 45, 23, 89, 34, 78, 90, 23};

        F.mno(w);
    }
}
// 0
// 1
// 2
// 3
// 4
// 8