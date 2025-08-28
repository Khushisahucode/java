import java.util.Comparator;
class nameascsort implements Comparator<User>{
     public int compare(User a,User b){
        return a.name.compareTo(b.name);
              }
}

