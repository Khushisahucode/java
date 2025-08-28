class D{  
    
    void pro(){
    System.out.println(x);
}
   
    {
        System.out.println(x);
    }
    D(){
        super(x);
        System.out.println(x);
    }
 public static void main(String[]args){
        }
}
// D.java:4: error: cannot find symbol
//     System.out.println(x);
//                        ^
//   symbol:   variable x
//   location: class D
// D.java:7: error: cannot find symbol
//         System.out.println(x);
//                            ^
//   symbol:   variable x
//   location: class D
// D.java:11: error: cannot find symbol
//         System.out.println(x);
//                            ^
//   symbol:   variable x
//   location: class D