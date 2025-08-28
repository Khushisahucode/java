


class E{  
     int x=100;
    static class aa2{
           static void pro(){
              System.out.println(x);
           }
    }
    public static void main(String[]args){
        aa2  nested=new aa2();
        nested.pro();
        
    }
}
// E.java:8: error: non-static variable x cannot be referenced from a static context
//               System.out.println(x);
//                                  ^
// 1 error