public class S extends x1{
    public static void main(String[] args) {
        S s=new S();
        S.aa x=s.new aa();
        x.pro();
        System.out.println(x.y);
    }
}
  class x1{
    class aa{ 
        int y=10;
        void pro(){
System.out.println("hiii.....");
        }
    }

  }
//   hiii.....
// 10