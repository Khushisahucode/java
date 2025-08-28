import java.util.HashMap;
class put6 {
    public static void main(String[] args) {
        HashMap<student,String> map = new HashMap<student,String>();
        
        map.put(new student("mohan", 20), "Global");
        map.put(new student("vikram", 18), "SRIT");
        map.put(new student("suresh", 21), "GGCT");
        map.put(new student("ranveer", 19), "JEC");
        map.put(new student("mukesh", 22), "GGITS");
         map.put(new student("suresh", 21), "HEC");
        System.out.println(map);
     }}
//71 ~~~~mohan ~ 20
// 92 ~~~~vikram ~ 18
// 111 ~~~~suresh ~ 21
// 102 ~~~~ranveer ~ 19
// 99 ~~~~mukesh ~ 22
// 111 ~~~~suresh ~ 21
// suresh ~ 21 ^^^^ suresh ~ 21
//{mukesh ~ 22=GGITS, ranveer ~ 19=JEC, mohan ~ 20=Global, vikram ~ 18=SRIT, suresh ~ 21=HEC}