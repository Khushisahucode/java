interface nn {
   void aaa();
}
public class V1 {
      
    public static void main(String[] args) {
        nn x=new nn(){//local method  anonymous inner class
           public void aaa(){
           System.out.println("namaskar.....");
            }
        };
        x.aaa();

    }
}
//namaskar.....