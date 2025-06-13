
class rectangle{
    private int w;
    private int l;
    void setarea(int w,int l){//getter function
      this.l=l;
      this.w=w;
}
  void getarea(){   //setter function
      System.out.println("rectangle parimetre = "+w*l);
      System.out.println("rectangle area = "+2*(w+l));
  }}
  class RR { public static void main(String[] args) {
      rectangle x=new rectangle();
      x.setarea(12,34);
      x.getarea();
  }
  }
  //   rectangle parimetre = 408
//   rectangle area = 92