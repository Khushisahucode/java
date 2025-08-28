import java.io.File;

class L1 {
    public static void main(String[] args) {
        File file = new File("D:\\chutki.txt");

        System.out.println("D:\\chutki.txt exists?: " + file.exists());
        
        boolean flag = file.mkdir();

        System.out.println("folder dholkapur created? : " + flag);
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("dholakpur exists?: " + file.exists());
    }
}
// D:\chutki.txt exists?: false
// folder dholkapur created? : true
// ~~~~~~~~~~~~~~~~~~
// dholakpur exists?: true