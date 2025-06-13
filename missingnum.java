public class missingnum {
    public static void main(String[]args){
        int arr[]={3,0,1,2,5};
        int sum=0;int n=0;
        for(int i=0;i<arr.length;i++){
        sum =sum+arr[i];
        
    }
   System.out.println(sum);
      for (int i=0;i<=arr.length;i++){
        n=n+i;
       } System.out.println(n);
       int missingnum=n-sum;
       System.err.println("missing number of array is :"+ missingnum);
    }
    
}


