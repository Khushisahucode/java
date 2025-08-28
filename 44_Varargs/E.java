class E {
    static void mno(int... x) {

    }   
    
    public static void main(String[] args) {
        E.mno();
        E.mno(12);
        E.mno(12, 23);
        E.mno(12, 23, 45);
        E.mno(12, 23, 45, 56);

        int[] w = {1, 45, 23, 89, 34, 78, 90, 23};

        E.mno(w);
    }
}