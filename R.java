import java.util.Scanner;
class R{

    public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.print("enter array size :");
       int n= sc.nextInt();
       System.out.println("enter array elements :");
       int arr[] =new int [n];
       for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }


    System.out.println("array elements are :");
    for (int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
 }

 
}