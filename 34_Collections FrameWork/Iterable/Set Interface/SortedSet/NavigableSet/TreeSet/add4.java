import java.util.TreeSet;

class add4 {
    public static void main(String[] args) {
        TreeSet<User2> x = new TreeSet<User2>();
        x.add(new User2("khushi",15));
        x.add(new User2("madhu",78));
         x.add(new User2("om",24));
         x.add(new User2("riya",50));
          x.add(new User2("ayush",10));
         x.add(new User2("rubi",13));
          System.out.println("TreeSet is : " + x);
        }
}
// khushi-15....compareTo....khushi-15
// madhu-78....compareTo....khushi-15
// om-24....compareTo....khushi-15
// om-24....compareTo....madhu-78
// riya-50....compareTo....madhu-78
// riya-50....compareTo....om-24
// ayush-10....compareTo....madhu-78
// ayush-10....compareTo....khushi-15
// rubi-13....compareTo....madhu-78
// rubi-13....compareTo....om-24
// rubi-13....compareTo....riya-50
// TreeSet is : [ayush-10, khushi-15, madhu-78, om-24, riya-50, rubi-13]