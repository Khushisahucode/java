import java.io.Console;
import java.util.Comparator;
import java.util.PriorityQueue;
public class comparator {
    
    public static void main(String[] args) {
        Console com=System.console();
        System.out.print("press 1 for nameAscsort\n  2 for nameDscsort \n 3 for AgeAscsort \n 4 for AgeDscsort   " );
                        
        int val = Integer.parseInt(com.readLine());
        Comparator comp=null;
        switch(val){
      case 1:
           comp= new nameascsort();
          break;
          case 2:
          comp=  new namedscsort();
          break;
          case 3:
          comp=new ageascsort();
          break;
          case 4:
              comp=new agedscsort();
              break;
              default:
              System.exit(0);
        }
    
     PriorityQueue<Employee> queue = new PriorityQueue<Employee>(comp);
      queue.offer(new Employee("ketak", 8));
        queue.offer(new Employee("hitesh", 15));
        queue.offer(new Employee("sarvan", 10));
        queue.offer(new Employee("giyan", 17));
        queue.offer(new Employee("giyan", 7));
        queue.offer(new Employee("ninja", 12));
          System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

}
}
// press 1 for nameAscsort
//   2 for nameDscsort 
//  3 for AgeAscsort 
//  4 for AgeDscsort   3
// giyan - 7
// ketak - 8
// sarvan - 10
// ninja - 12
// hitesh - 15
// giyan - 17