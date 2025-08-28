class a1{
    float show(){

          return 3.8;
    }
}

public class A2 extends a1  {
    double show(){

        return 0.45f;
    }
    /*
     * A2.java:4: error: incompatible types: possible lossy conversion from double to float
          return 0.3;
                 ^
A2.java:9: error: show() in A2 cannot override show() in a1
    double show(){
           ^
  return type double is not compatible with float
2 errors

     */
    
