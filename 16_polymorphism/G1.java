

public class G1 {
    public static void main(String[]args){
       vehicle x=new car();
       if(x instanceof car  ){
        System.out.println("car IS-A car");
       }
      else{
        System.out.print("car is not A car");
      }

    }
}
