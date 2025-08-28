
import java.util.TreeMap;

class put {

    public static void main(String[] args) {
        TreeMap<User, Double> x = new TreeMap< User, Double>();
        x.put(new User("khushi", 12), 12.56);
        x.put(new User("om", 10), 112.56);
        x.put(new User("riya", 18), 186.56);
        x.put(new User("madhu", 23), 136.6);
        x.put(new User("bhoomi", 45), 120.56);
        x.put(new User("ashvi", 62), 132.56);
        Double d = 12.56;
        System.out.println(x);
        System.out.println(x.put(new User("khushi", 12), d));
        System.out.println(x);
        Double d2 = 92.56;
        System.out.println(x.put(new User("khushi", 34), d2));
        System.out.println(x);
        System.out.println(x.put(new User("asika", 34), d2));
        System.out.println(x);
    }
}
// khushi-12....compareTo....khushi-12
// om-10....compareTo....khushi-12
// riya-18....compareTo....khushi-12
// riya-18....compareTo....om-10
// madhu-23....compareTo....om-10
// madhu-23....compareTo....khushi-12
// bhoomi-45....compareTo....om-10
// bhoomi-45....compareTo....khushi-12
// ashvi-62....compareTo....om-10
// ashvi-62....compareTo....khushi-12
// ashvi-62....compareTo....bhoomi-45
// {ashvi-62=132.56, bhoomi-45=120.56, khushi-12=12.56, madhu-23=136.6, om-10=112.56, riya-18=186.56}
// khushi-12....compareTo....om-10
// khushi-12....compareTo....khushi-12
// 12.56
// {ashvi-62=132.56, bhoomi-45=120.56, khushi-12=12.56, madhu-23=136.6, om-10=112.56, riya-18=186.56}
// khushi-34....compareTo....om-10
// khushi-34....compareTo....khushi-12
// 12.56
// {ashvi-62=132.56, bhoomi-45=120.56, khushi-12=92.56, madhu-23=136.6, om-10=112.56, riya-18=186.56}
// asika-34....compareTo....om-10
// asika-34....compareTo....khushi-12
// asika-34....compareTo....bhoomi-45
// asika-34....compareTo....ashvi-62
// null
// {ashvi-62=132.56, asika-34=92.56, bhoomi-45=120.56, khushi-12=92.56, madhu-23=136.6, om-10=112.56, riya-18=186.56}
