import java.util.HashMap;
class put4 {
    public static void main(String[] args) {
        HashMap<student1,String> map = new HashMap<student1,String>();
        
        map.put(new student1("mohan", 20), "Global");
        map.put(new student1("vikram", 18), "SRIT");
        map.put(new student1("suresh", 21), "GGCT");
        map.put(new student1("ranveer", 19), "JEC");
        map.put(new student1("mukesh", 22), "GGITS");

        System.out.println(map);
    }
}//{mohan-20=Global, ranveer-19=JEC, vikram-18=SRIT, mukesh-22=GGITS, suresh-21=GGCT}