package p.q.r;
  class A{
 private   int x=21;
    private void pro(){
        System.out.print("value of x :");
        System.out.println(x);
    }
       private  void show(){
            System.out.println("hello System !!");
        }
        public static void main(String[] args) {
            A a2=new A();
            a2.show();
            a2.pro();
        }
        }
    /*
     *hello System !!
value of x :21 
     */
