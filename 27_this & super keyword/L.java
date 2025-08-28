 class shape {
    
    int w;
    int l;
    int h;
    shape(int l){
        this.l=l; 

    }

    shape(int l,int w){
        this(l);
        System.out.println("width  = "+this.w);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        this.w=w;

    }
    shape(int l,int w,int h){
        this(l,w); 
        System.out.println("length = "+this.l);
        System.out.println("width = "+this.w);
        System.out.println("height = "+this.h);
        this.h=h;
         System.out.println("height = "+this.h);
    }
}
    public class L{
        public static void main(String[] args) {
    shape s=new shape(12,6,3);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("length  = "+s.l);
 System.out.println("width  = "+s.w);
 System.out.println("height  = "+s.h);
        }
    }
// width  = 0
// ~~~~~~~~~~~~~~~~~~~~~~~~
// length = 12
// width = 6
// height = 0
// ~~~~~~~~~~~~~~~~~~~~~~~~
// length  = 12
// width  = 6
// height  = 3

