import java.util.Comparator;


class ageascsort implements Comparator<User>{
       public int compare(User a,User b){
             return a.age.compareTo(b.age);
              }
}