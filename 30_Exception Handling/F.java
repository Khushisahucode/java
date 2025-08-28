public class F {
    
    public static void main(String[] args) {
        int []arr={23,5,7,68,9};
        try {
         System.out.println(arr[5]);   
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("some problm ");
        }
        
    }
}
//some problm 