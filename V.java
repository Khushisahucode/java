class V{
    public static void main(String[]args){
    int arr1[]={1,4,2,3,};
    int arr2[]={2,3,4,5};
    //[]output={1,2,3,4,2,3,4,5};
    System.out.println("common values in arrays are :");
        for(int i=0;i<arr1.length;i++)
       {
        for(int j=0;j<arr2.length;j++){
            if(arr1[i]==arr2[j]&&i!=j){
               System.out.println( + arr1[i]);
            }
        }
       }
       
    }


    }
