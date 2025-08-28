
public class R {
    public static void main(String[] args) {
        String [] arr= { "khushi","madhu","riya","mukku","aaddi","rishabh","hariom","ishika"};
        
        System.out.println(" array length is : "+arr.length);
        System.out.println("array elements are : ");
          System.out.println("classic for loop : ");
        //classic For Loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enhanced for loop : ");
     //Enhanced For Loop
     for(String i:arr){
        System.out.println(i+"~~");
     }
    }
}
