import java.util.Arrays;
class binarysearch{
    public static void main(String[]args){
       int[]arr={12,45,1,-9,76,65,8};
       Arrays.sort(arr);
       for(int next :arr){
        System.out.print(next+ " "); }
       System.out.println();
       char key='A';
    int n=Arrays.binarySearch(arr,key);
    System.out.println("key found in index :"+ n);
     int m=Arrays.binarySearch(arr,76);
    System.out.println("key found in index :"+ m);}
}
// -9 1 8 12 45 65 76 
// key found in index :5
// key found in index :6