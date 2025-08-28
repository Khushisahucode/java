public class C {
    
        int x=99;
            void pro(){
            System.out.println(this);
        }
           
            {
                System.out.println(this);
            }
            C(){
                super(this);
                System.out.println(this);
            }
        
        
            public static void main(String[]args){
               
        
            }
        }

//         C.java:12: error: constructor Object in class Object cannot be applied to given types;
//         super(this);
//         ^
// required: no arguments
// found:    C
// reason: actual and formal argument lists differ in length
// 2 errors