import java.io.Serializable;
class Employee implements Serializable{
    String  name;
    float ratings;
    float salary;
    public String toString(){
      return name+ " ..."+ salary+ "...."+ratings ;
    }
}