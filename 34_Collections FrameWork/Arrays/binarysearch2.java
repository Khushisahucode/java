import java.util.Arrays;
class binarysearch2{
    public static void main(String[]args){
      char [] arr={'3','M','j','s','Y','Z','8'};
       Arrays.sort(arr);
       for(int next :arr){
        System.out.print(next+ " "); }
       System.out.println();
       char key='A';
    int n=Arrays.binarySearch(arr,key);
    System.out.println("key found in index :"+ n);
     int m=Arrays.binarySearch(arr,'Z');
    System.out.println("key found in index :"+ m);}
}
// 51 56 77 89 90 106 115 
// key found in index :-3
// key found in index :4