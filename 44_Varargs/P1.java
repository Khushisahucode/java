class P1 {
    static void pro(int... marks) {
        for(int next : marks)
        
            System.out.println(next); 
        System.out.println("~~~~~~~~~~~");
        
    }

    public static void main(String[] args) {
        int [][]arr={{23,45},{45,6,7}};
        pro(arr);
    }    
}
// P1.java:12: error: method pro in class P1 cannot be applied to given types;
//         pro(arr);
//         ^
//   required: int[]
//   found:    int[][]
//   reason: varargs mismatch; int[][] cannot be converted to int
// 1 error