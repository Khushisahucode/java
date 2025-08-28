public class C {

public static void main(String[]args){
        int x=23;
       // String y=x.toString();
        String y=Integer.toString(x);//23
        System.out.println(y); 
    }
    
}
// C.java:5: error: int cannot be dereferenced
//         String y=x.toString(x);
//                   ^
// 1 error