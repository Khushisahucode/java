//constructor overloading
class shape{
    int length;
    int width;
    int height;
    shape(int length)
    {
     this.length=length;   
    }
    shape(int length,int width){
         //this.length=length;
         this(4);
        this.width=width;
    }
    shape(int length,int width,int height){
       // this.length=length;
       // this.width=width;
       this(6,7);
        this.height=height;
    }

}
 public class This{
    public static void main(String[]args){
        shape s=new shape(5,12,10);
        System.out.println(  "length : "+s.length);
        System.out.println(   "width : "+s.width);
        System.out.print(  "height : "+s.height);
    }

}