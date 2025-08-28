import java.io.IOException;
class F{
    public static void main(String[]args){
        try{
            throw  new IOException();
      //  }catch(ArithmeticException e){//ok

        }catch(IOException e){

        }
    }
}