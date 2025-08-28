import java.util.Arrays;
class sort3{
    public static void main(String[]args){
       String [] arr={"3"," M","j"," s","Y","Z"," 8"};
       Arrays.sort(arr);
       for(String next :arr){
        System.out.print( ">"+next+ "<  ");
       }

//> 8<  > M<  > s<  >3<  >Y<  >Z<  >j<  
    }
}
