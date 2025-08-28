class a{
    int show(){

          return 0;
    }
}

public class A1 extends a  {
    long show(){

        return 0;
    }
}

/*A1.java:9: error: show() in A1 cannot override show() in a
    long show(){
         ^
  return type long is not compatible with int
1 error
 */