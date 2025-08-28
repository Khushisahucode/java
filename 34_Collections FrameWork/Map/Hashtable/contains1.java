import java.util.Hashtable;
class contains1{
    public static void main(String[] args) {
        Hashtable<student,String> map = new Hashtable<student,String>();
        
        map.put(new student("mohan", 20), "Global");
        map.put(new student("vikram", 18), "SRIT");
        map.put(new student("suresh", 21), "GGCT");
        map.put(new student("ranveer", 19), "JEC");
        map.put(new student("mukesh", 22), "GGITS");
        map.put(new student("suresh", 21), "HEC");

        System.out.println(map);

        student s = new student("suresh", 21);
        System.out.println(map.containsKey(s));
    }
}
// 71 ~~~~mohan ~ 20
// 92 ~~~~vikram ~ 18
// 111 ~~~~suresh ~ 21
// 102 ~~~~ranveer ~ 19
// 99 ~~~~mukesh ~ 22
// 111 ~~~~suresh ~ 21
// suresh ~ 21 ^^^^ suresh ~ 21
// {mohan ~ 20=Global, vikram ~ 18=SRIT, ranveer ~ 19=JEC, suresh ~ 21=HEC, mukesh ~ 22=GGITS}
// 111 ~~~~suresh ~ 21
// suresh ~ 21 ^^^^ suresh ~ 21
// true