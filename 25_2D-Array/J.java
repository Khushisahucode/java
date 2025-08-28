public class J {
    
        public static void main(String[] args) {
            String [][]x=new String [3][2];
            x[0][0]="khushi";
            x[0][1]="dholu";
            x[1][0]="bholu";
            x[1][1]="aditya";
            x[2][0]="raam";
            x[2][1]="madhu";
         
           for(int i=0;i<x.length;i++){
         for (int j = 0; j < x[i].length; j++) {
              System.out.print(x[i][j]+" ");
        }System.out.println("");
    }
}
}

