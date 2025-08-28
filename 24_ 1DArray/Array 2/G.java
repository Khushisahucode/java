//primitive type data type

class G{
    public static void main(String[]args){
      int []x=new byte[4];//not ok
      int []y=new short [3];//not ok
      int [] z=new char[2];//not ok

    }
}
/*
 * G.java:3: error: incompatible types: byte[] cannot be converted to int[]
      int []x=new byte[4];
              ^
G.java:4: error: incompatible types: short[] cannot be converted to int[]
      int []y=new short [3];
              ^
G.java:5: error: incompatible types: char[] cannot be converted to int[]
      int [] z=new char[2];
               ^
3 errors
 */