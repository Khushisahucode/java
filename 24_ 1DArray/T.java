public class T {
    public static void main(String[]args){
       int []x={10,20,30,40,50};
       int[]y =new int[x.length];
      //int y[]= {x[0],x[1],x[2],x[3],x[4]};
       for(int i=0;i<x.length;i++){
          y[i]=x[i];
       }
       System.out.println("array elments are : ");
       for(int i=0;i<y.length;i++){
        System.out.println(y[i]);
       }

    }
}
