
//constructor overloading
class X{
    int length;
    int width;
    int height;
    X(int length)
    {
     this.length=length;   
    }
    X(int length,int width){
         this.length=length;
        this.width=width;
    }
    X(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }

}
 public class shape{
    public static void main(String[]args){
        X s=new X(5,12,10);
        System.out.println(s.length);
        System.out.println(s.width);
        System.out.print(s.height);
    }

}