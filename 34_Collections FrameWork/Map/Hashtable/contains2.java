import java.util.Hashtable;


class contains2 {
    public static void main(String[] args) {
        Hashtable<student1,String> map = new Hashtable<student1,String>();
        map.put(new student1("mohan", 20), "Global");
        map.put(new student1("vikram", 18), "SRIT");
        map.put(new student1("suresh", 21), "GGCT");
        map.put(new student1("ranveer", 19), "JEC");
        map.put(new student1("mukesh", 22), "GGITS");
        map.put(new student1("suresh", 21), "HEC");
        System.out.println(map);
        student1 s = new student1("suresh", 21);
        System.out.println(map.containsKey(s));
    }
}
// {suresh-21=HEC, mohan-20=Global, ranveer-19=JEC, vikram-18=SRIT, mukesh-22=GGITS, suresh-21=GGCT}
// false