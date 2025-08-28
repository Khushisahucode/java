public class Q4  extends aa{
   int y=100;
   void pro(){
    System.out.println("pro() class Q4 ka.....");
   }

    class A extends bb{
        int y=1000;
        void pro(){
            System.out.println("pro() class A ka.....");
        }
   void info(){
    pro();
    super.pro();
    Q4.this.pro();
    Q4.super.pro();
   }
    }
    public static void main(String[] args) {
        Q4 q=new Q4();
       A a=q.new A();
       a.info();
    }}
    class aa{
     int y=11;
        void pro(){
            System.out.println("pro() class aa ka.....");
        }
    }
    class bb{
 int y=1111;
        void pro(){
            System.out.println("pro() class bb ka.....");
        }
    }

// pro() class A ka.....
// pro() class bb ka.....
// pro() class Q4 ka.....
// pro() class aa ka.....