 class p1 {
    
        
            void sum(int x){
                System.out.println("x  = "+ x);
            }
            void sum(double x,double y){
                System.out.println("double sum ="+ x+y);
            }
            void sum(int x,int y,int z){
                System.out.println("sum = "+ x+y+z);
            }
        
        }
        
         
         
         
         public class parent extends p1 {
            public static void main(String[] args) {
                p1 a=new p1();
                a.sum(3);
                a.sum(5.89,7.76);
                a.sum(3,67,7);
            }
    }

