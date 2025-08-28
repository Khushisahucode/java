 interface O {
    void pro();
}
  class o1 implements O{
    public static void main(String[] args) {
        
    }
     void pro(){
        
    }
}
/*
 * O1.java:8: error: pro() in o1 cannot implement pro() in O
     void pro(){
          ^
  attempting to assign weaker access privileges; was public
1 error
 */