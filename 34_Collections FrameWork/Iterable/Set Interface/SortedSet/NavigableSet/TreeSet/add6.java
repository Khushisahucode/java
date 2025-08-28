import java.util.TreeSet;
class add6 {
    public static void main(String[] args) {
        TreeSet<User4> x = new TreeSet<User4>();
        x.add(new User4("khushi",15));
        x.add(new User4("madhu",78));
         x.add(new User4("om",24));
         x.add(new User4("riya",50));
          x.add(new User4("ayush",10));
         x.add(new User4("rubi",13));
          System.out.println("TreeSet is : " + x);
        }
}
// khushi-15....compareTo....khushi-15
// madhu-78....compareTo....khushi-15
// om-24....compareTo....khushi-15
// om-24....compareTo....madhu-78
// riya-50....compareTo....om-24
// riya-50....compareTo....madhu-78
// ayush-10....compareTo....om-24
// ayush-10....compareTo....khushi-15
// rubi-13....compareTo....om-24
// rubi-13....compareTo....khushi-15
// rubi-13....compareTo....ayush-10
// TreeSet is : [ayush-10, rubi-13, khushi-15, om-24, riya-50, madhu-78]