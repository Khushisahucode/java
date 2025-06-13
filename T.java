public class T {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,2,1};
        int n=5;int i=0;
        System.out.print("unique value in array is :");
       int isunique = 0;
        for (;i<n-1;i++){
            isunique =1;
            for(int j=0;j<n-1;j++){
                if(arr[i] ==arr[j]&& i != j){
                isunique =1;    
                
                }
            }
        
        
        if(isunique ==0){
            System.out.println(arr[i]);
        }
        }
    }
    }


