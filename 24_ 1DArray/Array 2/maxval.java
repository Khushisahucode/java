class maxval{
    public static void main(String[]args){
     int []arr={1,-1,34,45,71,89,76};
     int max =arr[0];
     for (int i = 0; i < arr.length; i++) {
         if(arr[i]>max ){
            max=arr[i];
         }
     }System.out.println( " maximum value in array is : "+max);

    }
}