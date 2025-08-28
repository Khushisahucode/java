import java.util.ArrayList;
class toarray{
    public static void main(String[]args){
      ArrayList< Integer>x=new ArrayList<>();
      x.add(45);
      x.add(88);
      x.add(45);
      x.add(40);
      x.add(85);
      x.add(75);
      System.out.println("List is : "+ x);
      Object [] arr= x.toArray();
      for(Object next: x){
        System.out.print( " "+next);
      }
    }
}
// List is : [45, 88, 45, 40, 85, 75]
//  45 88 45 40 85 75