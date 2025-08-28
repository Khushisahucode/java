import java.util.Comparator;



class agedscsort implements Comparator<User>{
       public int compare(User a,User b){
             return b.age.compareTo(a.age);
              }
}