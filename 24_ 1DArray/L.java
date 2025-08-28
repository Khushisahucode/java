import java.io.Console;

public class L {
    public static void main(String[] args) {
        String [] arr=new String[4];
        //to print all elements of string array 
        for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i]+"~");  
        }
       // System.out.println("string array is :");
      //  arr[0]="om";
      // arr[1]=new String ("khushi");
     //  arr[2]=new String ("palak");
     //  arr[3]=new String ("aadii");
     
     Console x=System.console();
     System.out.println("enter array elements :");
     for(int i=0;i<arr.length;i++){
      arr[i]=x.readLine();
     }


     System.out.println("array elements is :");

     for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i]+"~");  
        }
    }
}