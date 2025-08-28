//constructor overloading
class shape1{
    int length;
    int width;
    int height;
    shape1(int length)
    {
     this.length=length;   
    }
    shape1(int length,int width){
         //this.length=length;
         this(4);
        this.width=width;
    }
    shape1(int length,int width,int height){
       // this.length=length;
       // this.width=width;
       this(6,7);
       this(3);
       
       /*
        * This1.java:19: error: redundant explicit constructor invocation
       this(3);
           ^
         1 error
        */
    
        this.height=height;
    }

}
 public class This1{
    public static void main(String[]args){
        shape1 s=new shape1(5,12,10);
        System.out.println(  "length : "+s.length);
        System.out.println(   "width : "+s.width);
        System.out.print(  "height : "+s.height);
    }

}
