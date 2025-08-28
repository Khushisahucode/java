import java.io.File;

class M {
    public static void main(String[] args) {
        File file = new File("D:/dholakpur");

        System.out.println("D:/dholakpur exists?: " + file.exists());
        
        boolean flag = file.mkdir();

        System.out.println("folder dholakpur created? : " + flag);
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("D:/dholakpur exists?: " + file.exists());
    }
}
// D:/dholakpur exists?: false
// folder dholakpur created? : true
// ~~~~~~~~~~~~~~~~~~
// D:/dholakpur exists?: true