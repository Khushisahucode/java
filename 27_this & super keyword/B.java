public class B {

        int x=99;
           static void pro(){
            System.out.println("value of x = "+this);
        }
           
           static {
                System.out.println("value of x = "+this);
            }
            B(){
                System.out.println("value of x = "+this);
            }
        
        
            public static void main(String[]args){
               
        
            }
        }

//         B.java:5: error: non-static variable this cannot be referenced from a static context
//         System.out.println("value of x = "+this);
//                                            ^
// B.java:9: error: non-static variable this cannot be referenced from a static context
//             System.out.println("value of x = "+this);
//                                                ^
// 2 errors