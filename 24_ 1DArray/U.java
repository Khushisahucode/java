
public class U {
    public static void main(String[]args){
       int []x={10,20,30,40,50};
       int[]y =new int[x.length];
       for(int i=0;i<x.length;i++){
        y[i]=x[ x.length -i-1];
       }
       System.out.println(" reversed array elments are : ");
       for(int i=0;i<y.length;i++){
        System.out.println(y[i]);
       }

    }
}
