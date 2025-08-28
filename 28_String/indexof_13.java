public class indexof_13 {
    
    public static void main(String[] args) {
        String str="om is a good boy and he is my best friend and he is in class 10th and he lives on an island and he likes mishti";
         int index=0;
         while((index=str.indexOf("is ",index))!=-1){
           System.out.println("index is = "+index );
           index++;
         }
    }
}
// index is = 3
// index is = 24
// index is = 49
