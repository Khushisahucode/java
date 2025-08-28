class T2 {
    static void pro(int[][]...marks) {
        for(int [][] next:marks){
            for(int []nx : next){
                for(int nxx:nx)
                System.out.println(nxx);
            }System.out.println("");
        }
    }

    public static void main(String[] args) {
        int [][]arr={{3,4,76,5},{23,45},{34,768,898}};
        pro(arr);
    }    
}
// 3
// 4
// 76
// 5
// 23
// 45
// 34
// 768
// 898
