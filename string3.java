public class string3 {
    public static void main(String[] args) {
      
        StringBuilder str=new StringBuilder("hello");
        str.append("hiiiii");
        System.out.println(str.length());
    System.out.println(str);
    System.out.println(str);//oldcapacity*2+2
    System.out.println(str.capacity());
    }  
  }
  /*
   * 11
hellohiiiii
hellohiiiii
21
   */
