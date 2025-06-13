public class palindromestring {

        public static void main(String[] args) {
            String str="khushi";
            String str2="";
            for(int i=str.length()-1;i>=0;i--){
                str2=str2 +str.charAt(i);
               // System.out.print(str.charAt(i));
    
        }
        System.out.println("");
    
        if (str.equals(str2)){
            System.out.println("String is palindrome");

        }else{
            System.out.println("string is not palindrome");
        }

    }
    }
    
