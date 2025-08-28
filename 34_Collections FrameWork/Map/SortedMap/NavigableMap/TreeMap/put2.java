import java.util.TreeMap;

class put2 {

    public static void main(String[] args) {
        TreeMap<User, college> x = new TreeMap< User, college>();
        x.put(new User("khushi", 12), new college("12.56") );
        x.put(new User("om", 10), new college("125.16") );
        x.put(new User("riya", 18), new college("27.86") );
        x.put(new User("madhu", 23),  new college("10.51"));
        x.put(new User("bhoomi", 45),  new college("22.46"));
        x.put(new User("ashvi", 62), new college("102.96") );
        college d =   new college("12.56");
        System.out.println(x);
        System.out.println(x.put(new User("khushi", 12), d));
        System.out.println(x);
        college d2 =  new college("92.66");
        System.out.println(x.put(new User("khushi", 34), d2));
        System.out.println(x);
        System.out.println(x.put(new User("ashvi", 82), d2));
        System.out.println(x);
    }
}
// khushi-34....compareTo....khushi-12
// 12.56
// {ashvi-62=102.96, bhoomi-45=22.46, khushi-12=92.66, madhu-23=10.51, om-10=125.16, riya-18=27.86}
// ashvi-82....compareTo....om-10
// ashvi-82....compareTo....khushi-12
// ashvi-82....compareTo....bhoomi-45
// ashvi-82....compareTo....ashvi-62
// 102.96
// {ashvi-62=92.66, bhoomi-45=22.46, khushi-12=92.66, madhu-23=10.51, om-10=125.16, riya-18=27.86}