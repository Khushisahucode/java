import java.io.File;

class L {
    public static void main(String[] args) {
        File file = new File("D:\chutki.txt");

        System.out.println("D:\chutki.txt exists?: " + file.exists());
        
        boolean flag = file.mkdir();

        System.out.println("folder dholkapur created? : " + flag);
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("dholakpur exists?: " + file.exists());
    }
}
// L.java:5: error: illegal escape character
//         File file = new File("D:\chutki.txt");
//                                  ^
// L.java:7: error: illegal escape character
//         System.out.println("D:\chutki.txt exists?: " + file.exists());
//                                ^
// L.java:7: error: ';' expected
//         System.out.println("D:\chutki.txt exists?: " + file.exists());
//                                                                     ^
// 3 errors