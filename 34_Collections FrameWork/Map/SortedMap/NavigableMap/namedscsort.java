import java.util.Comparator;
class namedscsort implements Comparator<User>{
      public int compare(User a,User b){
             return b.name.compareTo(a.name);
              }
}