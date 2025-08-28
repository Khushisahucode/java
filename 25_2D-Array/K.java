public class K {
    
    
        public static void main(String[] args) {
            int [][]x=new int [3][2];
            x[0][0]=12;
            x[0][1]=67;
            x[1][0]=90;
            x[1][1]=78;
            x[2][0]=100;
            x[2][1]=45;
         
           for(int []i :x){
         for (int j:i) {
              System.out.print(j+", ");
        }System.out.println("");
    }
}
}

