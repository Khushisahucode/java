
    class X{
        public static void main(String[]args){
        int arr1[]={1,4,2,3,};
        int arr2[]={2,3,4,5};
        
       int [] output= new int[arr1.length+arr2.length];
        //={1,2,3,4,2,3,4,5};
    
             for(int i=0;i<arr1.length;i++){
                output[i]=arr1[i];
             }
             for(int j=0;j<arr2.length;j++){
                output[arr1.length+j]=arr2[j];

             }
             System.out.print("output merged array are :   {");
             for(int k=0;k<output.length;k++)
                {
                 System.out.print(output[k] +",");
               }System.out.println("}");



        
                }
            }
           
           
        
    
    
        
    
