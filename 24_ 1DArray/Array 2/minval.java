public class minval {
    
    public static void main(String[]args){
     int []arr={1,-1,34,45,76679,89,76};
     int min =arr[0];
     for (int i = 0; i < arr.length; i++) {
         if(arr[i]<min){
            min=arr[i];
         }
     }System.out.println( " minimum value in array is : "+min);

    }
}