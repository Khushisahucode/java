public class average {
    public static void main(String[] args) {
        int arr[]={12,56,4,3,34,343,45};
         int sum=0;
         for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
         }
        
         float average =sum/arr.length;
         
         System.out.println("average of array elements  : "+average);
         
    }
}