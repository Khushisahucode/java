import java.util.Arrays;
class sort{
    public static void main(String[]args){
       int [] arr={12,45,1,-9,76,56,8};
       Arrays.sort(arr);
       for(int next :arr){
        System.out.print(next+ " ");
       }

//-9 1 8 12 45 56 76 
    }
}