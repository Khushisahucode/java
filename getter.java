

class Atm {
    private int a;
  void setrupee(int a) {
       this.a = a;
    }
 int getrupee() {
       return a;
    }
 }
public class getter {
 public static void main(String[] args) {
        Atm x=new Atm();
        x.setrupee(89000);
        System.out.println(x.getrupee());
    }
    
}//89000
