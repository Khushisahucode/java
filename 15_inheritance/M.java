
class bb extends b1{
   private  void walk(){
        System.out.println("i can walk");
    }
}
class x2 extends bb {
  void talk (){
    System.out.println("i can talk");
  }
}
class xx extends x2{
  void laugh(){
    System.out.println("i can laugh");
  }
}



public class M extends xx {
    public static void main(String[]args){
        M m1=new M();
        m1.talk();
        m1.laugh();
        m1.walk();
    }
}

/*
M.java:25: error: cannot find symbol
        m1.walk();
          ^
  symbol:   method walk()
  location: variable m1 of type M
1 error

 * 
 */
