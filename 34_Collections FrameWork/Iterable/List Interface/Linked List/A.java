
class A{
    public static void main(String[]args){
        LinkedList<String>x=new LinkedList<>();
    x.add("om");
        x.add("khushi");
        x.add("madhu");
        x.add("om");
        x.add("aadi");
        x.add("riya");
    System.out.println(x);
    x.add(2,"ragat");
        System.out.println(x); 
    
    }
}
// A.java:4: error: cannot find symbol
//         LinkedList<String>x=new LinkedList<>();
//         ^
//   symbol:   class LinkedList
//   location: class A
// A.java:4: error: cannot find symbol
//         LinkedList<String>x=new LinkedList<>();
//                                 ^
//   symbol:   class LinkedList
//   location: class A
// 2 errors