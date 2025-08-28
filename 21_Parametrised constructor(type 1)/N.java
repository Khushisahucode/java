public class N {

        final int x;
        N(){
            x=90;
        }
        N(int y){
        x= 67;
        }
        public static void main(String[] args) {
            N s=new N(6);
            System.out.println("value of x :"+s.x);
            N s1=new N();
            System.out.println("value of x :"+s1.x);
        }
        }
    

