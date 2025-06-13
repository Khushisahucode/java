
class temperature{
    private int celsius;
    
    void setfahrenheit(int celsius){//getter function
      this.celsius=celsius;
      
}
  int getfahrenheit(){   //setter function
       int c=celsius+273;
       return c;
   // System.out.println("value is = "+ c);
  }}
  class Main3 { public static void main(String[] args) {
      temperature x=new temperature();
      x.setfahrenheit(45);
      System.out.println("value is = "+x.getfahrenheit());
  }
  }//output 
  //value is = 318